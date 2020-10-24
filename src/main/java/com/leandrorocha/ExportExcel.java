package com.leandrorocha;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

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
	//Código|Produto|NCM|CST|CSOSN|Aliquota|CFOP
		Cell cell = row.createCell(0);
		cell.setCellValue("Codigo");
		
		cell = row.createCell(1);
		cell.setCellValue("Descricao");
		
		cell = row.createCell(2);
		cell.setCellValue("NCM");
		
		cell = row.createCell(3);
		cell.setCellValue("CST");
		
		cell = row.createCell(4);
		cell.setCellValue("CSOSN");
		
		cell = row.createCell(5);
		cell.setCellValue("ALIQUOTA");
		
		cell = row.createCell(6);
		cell.setCellValue("CFOP");
		
		cell = row.createCell(7);
		cell.setCellValue("CEST");
		
		cell = row.createCell(8);
		cell.setCellValue("IPI");
		
		cell = row.createCell(9);
		cell.setCellValue("PISCOFINS");
	}

	private void writeDataRows() {
		int rowCount = 1;
		
		for(Produto produto : listProdutos) {
			Row row = sheet.createRow(rowCount++);
		//	Código|Produto|NCM|CST|CSOSN|Aliquota|CFOP
			Cell cell = row.createCell(0);
			cell.setCellValue(produto.getCodigo());
			
			cell = row.createCell(1);
			cell.setCellValue(produto.getDescricao());
			
			cell = row.createCell(2);
			cell.setCellValue(produto.getNcm());
			
			cell = row.createCell(3);
			cell.setCellValue(produto.getCst());
			
			cell = row.createCell(4);
			cell.setCellValue(produto.getCsosn());
			
			cell = row.createCell(5);
			cell.setCellValue(produto.getAliquota());
			
			cell = row.createCell(6);
			cell.setCellValue(produto.getCfop());
			
			cell = row.createCell(7);
			cell.setCellValue(produto.getCest());
			
			cell = row.createCell(8);
			cell.setCellValue(produto.getIpi());
			
			cell = row.createCell(9);
			cell.setCellValue(produto.getPiscofins());
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
		
		System.out.println("Arquivo exportado com sucesso");
		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
