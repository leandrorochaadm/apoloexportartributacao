package com.leandrorocha;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class ConsultandoRegistrosTest {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	
	@BeforeAll
	public static void setUpBeforeClass() {
		emf = Persistence.createEntityManagerFactory("apolo");
	}
	
	@AfterAll
	public static void tearDownAfterClass() {
	emf.close();	
	}
	
	@BeforeEach
	public void setUp() {
		em = emf.createEntityManager();
	}
	
	@AfterEach
	public void tearDown() {
		em.close();
	}
	
	@Test
	public void buscarPorCodigo() {
		Produto produto = em.find(Produto.class, "000001");
		Assertions.assertNotNull(produto);
	}

}
