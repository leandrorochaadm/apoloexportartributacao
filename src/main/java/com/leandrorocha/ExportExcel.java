package com.leandrorocha;

import java.io.Console;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.imageio.stream.FileCacheImageOutputStream;

import org.apache.poi.poifs.filesystem.DocumentOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExportExcel {

	private XSSFWorkbook workbook;
	private XSSFSheet sheet;
	private final List<Produto> listProdutos;
	
	public ExportExcel(List<Produto> produtos) {
		this.listProdutos = produtos;
		workbook = new XSSFWorkbook();
		sheet = workbook.createSheet("produtos");
		
	}
	private void writeHeaderRow() {
		Row row = sheet.createRow(0);
		
		Cell cell = row.createCell(0);
		cell.setCellValue("Codigo");
		
		cell = row.createCell(1);
		cell.setCellValue("Descricao");
	}

	private void writeDataRows() {
		int rowCount = 1;
		
		for(Produto produto : listProdutos) {
			Row row = sheet.createRow(rowCount++);
			
			Cell cell = row.createCell(0);
			cell.setCellValue(produto.getCodigo());
			
			cell = row.createCell(1);
			cell.setCellValue(produto.getDescricao());
		}
	}
	
	public void export() throws IOException {
		System.out.println("Aguarde... processando planilha");
		try {
		writeHeaderRow();
		writeDataRows();
		
		File arquivo = new File("produtosTributacao.xlsx");
		OutputStream output = new FileOutputStream("C:\\apolo\\"+arquivo);
		workbook.write(output);
		workbook.close();
		
		System.out.println("Arquivo exportado");
		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
