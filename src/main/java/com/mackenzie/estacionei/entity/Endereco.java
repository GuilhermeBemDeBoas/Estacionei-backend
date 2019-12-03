package com.mackenzie.estacionei.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEndereco;
	private String cep;
	private int numero;
	private String logradouro;

	public Endereco() {
	}

	public Endereco(String cep, int numero, String logradouro) {
		this.cep = cep;
		this.numero = numero;
		this.logradouro = logradouro;
	}

	public Endereco(Long idEndereco, String cep, int numero, String logradouro) {
		this.idEndereco = idEndereco;
		this.cep = cep;
		this.numero = numero;
		this.logradouro = logradouro;
	}

	public Endereco(String cep) {
		this.cep = cep;
	}

	public Long getIdEndereco() {
		return idEndereco;
	}
	public void setIdEndereco(Long idEndereco) {
		this.idEndereco = idEndereco;
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
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
}
