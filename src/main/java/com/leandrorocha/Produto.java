package com.leandrorocha;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "C000025")
public class Produto {
	
	@Id
	private String codigo;
	
	@Column(name = "produto")
	private String descricao;
	
	@Column(name = "classificacao_fiscal")
	private String ncm;
	
	private String cest;
	
	private String cst;
	
	private String csosn;
	
	private String aliquota;
	
	private String reducao;
	
	private String cfop;
	
	private String ipi;
	
	private String piscofins;


	
	/*
	 * public Produto() {
	 * 
	 * }
	 * 
	 * public Produto(String codigo, String descricao) { this.codigo = codigo;
	 * this.descricao = descricao; }
	 */
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNcm() {
		return ncm;
	}

	public void setNcm(String ncm) {
		this.ncm = ncm;
	}

	public String getCfop() {
		return cfop;
	}

	public void setCfop(String cfop) {
		this.cfop = cfop;
	}

	public String getCst() {
		return cst;
	}

	public void setCst(String cst) {
		this.cst = cst;
	}

	public String getCsosn() {
		return csosn;
	}

	public void setCsosn(String csosn) {
		this.csosn = csosn;
	}

	public String getCest() {
		return cest;
	}

	public void setCest(String cest) {
		this.cest = cest;
	}

	public String getAliquota() {
		return aliquota;
	}

	public void setAliquota(String aliquota) {
		this.aliquota = aliquota;
	}

	public String getReducao() {
		return reducao;
	}

	public void setReducao(String reducao) {
		this.reducao = reducao;
	}

	public String getIpi() {
		return ipi;
	}

	public void setIpi(String ipi) {
		this.ipi = ipi;
	}

	public String getPiscofins() {
		return piscofins;
	}

	public void setPiscofins(String piscofins) {
		this.piscofins = piscofins;
	}
	
	

}
