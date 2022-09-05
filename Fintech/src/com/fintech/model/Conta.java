package com.fintech.model;

public abstract class Conta {	
	
	//Atributos
	private Integer numero;
	private Integer agencia;
	protected Double saldo;
	
		
	//Construtores
	public Conta() {}
	
	public Conta(Integer numero, Integer agencia, Double saldo) {
		
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	
	//Metodos
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Integer getAgencia() {
		return agencia;
	}
	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}
