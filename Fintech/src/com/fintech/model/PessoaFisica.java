package com.fintech.model;

import java.util.Date;

public class PessoaFisica extends Pessoa{
	
	//Atributos
	private Integer cpf;
	private Integer rgInteger;
	private Date dtNascimento;
	
	
	//Construtores
	/**
	 * 
	 */
	public PessoaFisica() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param nome
	 * @param endereco
	 * @param email
	 * @param telefone
	 */
	public PessoaFisica(String nome, String endereco, String email, Integer telefone) {
		super(nome, endereco, email, telefone);
		// TODO Auto-generated constructor stub
	}
	
	
	
	//Metodos
	public Integer getCpf() {
		return cpf;
	}
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	public Integer getRgInteger() {
		return rgInteger;
	}
	public void setRgInteger(Integer rgInteger) {
		this.rgInteger = rgInteger;
	}
	public Date getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
		

}
