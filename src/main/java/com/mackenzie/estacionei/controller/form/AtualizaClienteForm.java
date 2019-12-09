package com.mackenzie.estacionei.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.mackenzie.estacionei.entity.Cliente;

public class AtualizaClienteForm {

	@NotNull @NotEmpty
	private String nome;
	@NotNull @NotEmpty
	private String email;
	@NotNull
	private AtualizaEnderecoForm endereco;
	
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

	public AtualizaEnderecoForm getEndereco() {
		return endereco;
	}

	public void setEndereco(AtualizaEnderecoForm endereco) {
		this.endereco = endereco;
	}

	public Cliente atualizar(Cliente cliente) {
		cliente.setNome(this.nome);
		cliente.setEmail(this.email);
		cliente.setEndereco(endereco.atualizar(cliente.getEndereco()));
		
		return cliente;
	}
}
