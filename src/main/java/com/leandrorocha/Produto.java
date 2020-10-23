package com.leandrorocha;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "C000025")
public class Produto {
	
	@Id
	private String codigo;
	
	private String produto;
	
	public Produto() {
		
	}
	
	public Produto(String codigo, String produto) {
		this.codigo = codigo;
		this.produto = produto;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", produto=" + produto + "]";
	}
	
	

}
