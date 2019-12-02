package com.mackenzie.estacionei.entity;

import javax.persistence.Id;

public class Endereco {
	
	@Id
	private String cep;
	private int numero;
	private String Logradouro;
	
	public Endereco(String cep) {
		this.cep = cep;
	}
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getLogradouro() {
		return Logradouro;
	}
	public void setLogradouro(String logradouro) {
		Logradouro = logradouro;
	}
	
}
