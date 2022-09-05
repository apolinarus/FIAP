package com.fintech.model;

public class ContaPoupanca extends Conta {
	
	private double txJuros;

	
	//Construtores
	public ContaPoupanca() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaPoupanca(Integer numero, Integer agencia, Double saldo, Double txJuros) {
		super(numero, agencia, saldo);
		this.txJuros = txJuros;
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
