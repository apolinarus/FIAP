package com.fintech.model;

import java.math.BigInteger;
import java.util.Date;

public class PessoaFisica extends Pessoa{
	
	//Atributos
	private BigInteger cpf;
	private BigInteger rg;
	private String dtNascimento;
	private ContaCorrente contaCorrente;
	private ContaPoupanca contaPoupanca;
	
	
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
	public BigInteger getCpf() {
		return cpf;
	}
	public void setCpf(BigInteger cpf) {
		this.cpf = cpf;
	}
	public BigInteger getRg() {
		return rg;
	}
	public void setRgInteger(BigInteger rg) {
		this.rg = rg;
	}
	public String getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public ContaCorrente getContaCorrente() {
		return contaCorrente;
	}
	public void setContaCorrente(ContaCorrente contaCorrente) {
		this.contaCorrente = contaCorrente;
	}
	public ContaPoupanca getContaPoupanca() {
		return contaPoupanca;
	}
	public void setContaPoupanca(ContaPoupanca contaPoupanca) {
		this.contaPoupanca = contaPoupanca;
	}
		

}
