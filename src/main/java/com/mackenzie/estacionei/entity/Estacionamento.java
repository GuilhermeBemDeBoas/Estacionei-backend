package com.mackenzie.estacionei.entity;

import java.util.List;

import javax.persistence.*;

@Entity
public class Estacionamento {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEstacionamento;
	private String nome;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "estacionamento")
	private List<Vaga> vagas;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_endereco")
	private Endereco endereco;

	public Estacionamento() {
	}

	public Estacionamento(String nome) {
		this.nome = nome;
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
