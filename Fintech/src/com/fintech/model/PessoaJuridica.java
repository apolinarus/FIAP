package com.fintech.model;

import java.util.Date;

public class PessoaJuridica extends Pessoa{
	
	//Atributos
	private Integer cnpj;
	private String razaoSocial;
	private Date dtAbetura;	
	
	//Construtores
	public PessoaJuridica() {
		super();
		// TODO Auto-generated constructor stub
	}		
	
	/**
	 * @param cnpj
	 * @param razaoSocial
	 * @param dtAbetura
	 */
	public PessoaJuridica(String nome, String endereco, String email, Integer telefone ,Integer cnpj, String razaoSocial, Date dtAbetura) {
		super(nome, endereco, email, telefone);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.dtAbetura = dtAbetura;
	}
	
	
	
	//Metodos
	public Integer getCnpj() {
		return cnpj;
	}
	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public Date getDtAbetura() {
		return dtAbetura;
	}
	public void setDtAbetura(Date dtAbetura) {
		this.dtAbetura = dtAbetura;
	}

}
