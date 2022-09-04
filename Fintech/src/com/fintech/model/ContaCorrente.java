package com.fintech.model;

public class ContaCorrente extends Conta {
	
	private Double limiteChequeEspecial;

	
	//Construtores
	public ContaCorrente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaCorrente(Integer numero, Integer agencia, Double saldo, Double limite) {
		super(numero, agencia, saldo);
		this.limiteChequeEspecial = limite;
		// TODO Auto-generated constructor stub
	}
	
	

}
