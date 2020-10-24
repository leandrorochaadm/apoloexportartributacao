package com.leandrorocha;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) throws IOException {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("apolo");
		EntityManager em = emf.createEntityManager();

		try {

			List<Produto> produtos = em.createQuery("SELECT p FROM Produto p", Produto.class).getResultList();

			ExportExcel export = new ExportExcel(produtos);

			export.export();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			em.close();
			emf.close();
		}
	}
}
