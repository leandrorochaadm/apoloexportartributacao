package com.leandrorocha;

import java.io.IOException;
import java.util.List;

public class App {
	public static void main(String[] args) throws IOException {
 
        ProdutoRepository repository = new ProdutoRepository();
        List<Produto> produtos = repository.listar();	

		ExportExcel export = new ExportExcel(produtos);
	
		export.export();
	}
}
