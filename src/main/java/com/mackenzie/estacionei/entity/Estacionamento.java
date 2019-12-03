package com.mackenzie.estacionei.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Estacionamento {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEstacionamento;
	private String nome;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "estacionamento")
	private List<Vaga> vagas  = new ArrayList<>();

	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "id_endereco")
	private Endereco endereco;

	public Estacionamento() {
	}

	public Estacionamento(String nome, Endereco endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	public Long getIdEstacionamento() {
		return idEstacionamento;
	}
	public void setIdEstacionamento(Long idEstacionamento) {
		this.idEstacionamento = idEstacionamento;
	}
	public List<Vaga> getVagas() {
		return vagas;
	}
	public void setVagas(List<Vaga> vagas) {
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
