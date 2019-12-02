package com.mackenzie.estacionei.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.mackenzie.estacionei.entity.Cliente;
import com.mackenzie.estacionei.repository.ClienteRepository;

public class AtualizaClienteForm {

	@NotNull @NotEmpty
	private String nome;
	@NotNull @NotEmpty
	private String email;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Cliente atualizar(String cpf, ClienteRepository clienteRepository) {
		Cliente cliente = clienteRepository.getOne(cpf);
		cliente.setNome(this.nome);
		cliente.setEmail(this.email);
		
		return cliente;
	}
}