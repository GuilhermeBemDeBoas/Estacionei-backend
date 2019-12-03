package com.mackenzie.estacionei.entity;

import java.util.ArrayList;

import javax.persistence.*;

@Entity
public class Estacionamento {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEstacionamento;
	private String nome;

	@OneToMany
	private ArrayList <Vaga> vagas;

	@OneToOne
	private Endereco endereco;

	public Estacionamento(String nome) {
		this.nome = nome;
	}

	public Long getIdEstacionamento() {
		return idEstacionamento;
	}
	public void setIdEstacionamento(Long idEstacionamento) {
		this.idEstacionamento = idEstacionamento;
	}
	public ArrayList<Vaga> getVagas() {
		return vagas;
	}
	public void setVagas(ArrayList<Vaga> vagas) {
		this.vagas = vagas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
