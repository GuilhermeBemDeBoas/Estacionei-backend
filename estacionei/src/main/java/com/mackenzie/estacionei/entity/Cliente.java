package com.mackenzie.estacionei.entity;

import javax.persistence.Id;

public class Cliente {

	@Id
	String cpf;
	String nome;
	String email;	
	String endereco;
	String senha;
	Cartao cartao;
	Veiculo veiculo;
	
	public Cliente (String cpf, String nome, Veiculo veiculo) {
		this.cpf = cpf;
		this.nome = nome;
		this.veiculo = veiculo;
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public Cartao getCartao() {
		return cartao;
	}


	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}


	public Veiculo getVeiculo() {
		return veiculo;
	}


	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}


}
