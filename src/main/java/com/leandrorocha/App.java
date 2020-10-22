package com.leandrorocha;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
//        EntityManagerFactory emf =  Persistence.createEntityManagerFactory("apolo");
//        EntityManager em = emf.createEntityManager();
//         Produto p = em.find(Produto.class, "000001");
        ProdutoRepository repository = new ProdutoRepository();
        Produto p = repository.listar().get(0);
       
        System.out.println(p.toString());  
        
//        em.close();
//        emf.close();
    }
}
