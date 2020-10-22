package com.leandrorocha;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class GenericDAO<T> {

    private EntityManager em;
    private Class<T> classe;

    public GenericDAO(Class<T> classe) {
        this.classe = classe;
        if (em == null) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("apolo");
            em = emf.createEntityManager();
        }
    }
//metodos salvar, excluir...
    public void salvar(T objeto) {
        try {
            em.getTransaction().begin();
            em.merge(objeto);
            em.flush();
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    public void excluir(T objeto) {
try {
            em.getTransaction().begin();
            em.remove(objeto);
            em.flush();
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }
    
    public T recuperar(String id){
        return em.find(classe, id);
    }
    
    public List<T> listar(){
        
        return em.createQuery("from " + classe.getSimpleName() + " e").getResultList();
    }
    
    public void close(){
        em.clear();
    }
}
