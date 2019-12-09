package com.mackenzie.estacionei.controller.dto;

import com.mackenzie.estacionei.entity.Cliente;

public class DetalharClienteDTO {

	private String cpf;
	private String nome;
	private String email;
	private String endereco;
	
	public DetalharClienteDTO(Cliente cliente) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public String getEndereco() {
		return endereco;
	}
}
