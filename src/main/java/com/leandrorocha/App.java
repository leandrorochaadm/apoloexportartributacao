package com.leandrorocha;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) throws IOException {
//		System.out.println("Hello World!");

//        EntityManagerFactory emf =  Persistence.createEntityManagerFactory("apolo");
//        EntityManager em = emf.createEntityManager();
//         Produto p = em.find(Produto.class, "000001");      
//        em.close();
//        emf.close();     

//        ProdutoRepository repository = new ProdutoRepository();
//        Produto p = repository.listar().get(0);
//        System.out.println(p.toString());  

		// int[][] plan = new int[3][3];
		/*
		 * int[][] plan = { { 1, 5, 8, 0 }, { 3, 9, 1, 0 }, { 9, 9, 1, 0 }, { 4, 1, 1, 0
		 * }, };
		 * 
		 * for (int x = 0; x < 3; x++) { for (int y = 0; y < 3; y++) { plan[x][3] +=
		 * plan[x][y]; } } int somaTotal = 0; for (int x = 0; x < 3; x++) { int x2 =
		 * plan[x][3]; somaTotal += x2; System.out.println(x2); }
		 * System.out.println("---------\n" + somaTotal);
		 */

		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add(new Produto("000001", "produto 1"));
		produtos.add(new Produto("000002", "produto 2"));
		produtos.add(new Produto("000003", "produto 3"));
		produtos.add(new Produto("000004", "produto 4"));
		

		ExportExcel export = new ExportExcel(produtos);
	
			export.export();
	}
}
