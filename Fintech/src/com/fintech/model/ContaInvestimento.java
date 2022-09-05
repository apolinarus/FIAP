package com.fintech.model;

public class ContaInvestimento extends Conta{
	
	//Atributos
	private double txJuros;

	
	
	
	//Construtores
	public ContaInvestimento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaInvestimento(Integer numero, Integer agencia, Double saldo) {
		super(numero, agencia, saldo);
		// TODO Auto-generated constructor stub
	}	
	
	
	//Metodos
	public double getTxJuros() {
		return txJuros;
	}

	public void setTxJuros(double txJuros) {
		this.txJuros = txJuros;
	}
	
	
	
	
	
	

}
