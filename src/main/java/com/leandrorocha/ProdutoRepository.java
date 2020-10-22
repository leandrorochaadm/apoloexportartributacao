package com.leandrorocha;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class ProdutoRepository extends GenericDAO<Produto>{

    public ProdutoRepository() {
        super(Produto.class);
    }
    
}
