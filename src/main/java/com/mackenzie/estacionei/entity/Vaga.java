package com.mackenzie.estacionei.entity;

import javax.persistence.*;

import com.mackenzie.estacionei.enums.StatusVaga;

@Entity
public class Vaga {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVaga;
	@Enumerated(EnumType.STRING)
	private StatusVaga status = StatusVaga.LIVRE;
	private Double precoHora;
	private String localizacao;

	@ManyToOne
	@JoinColumn(name = "id_estacionamento")
	private Estacionamento estacionamento;

	public Vaga() {
	}

	public Vaga(Double precoHora, String localizacao) {
		this.precoHora = precoHora;
		this.localizacao = localizacao;
		this.estacionamento = estacionamento;
	}

	public Long getIdVaga() {
		return idVaga;
	}
	public void setIdVaga(Long idVaga) {
		this.idVaga = idVaga;
	}
	public StatusVaga getStatus() {
		return status;
	}
	public void setStatus(StatusVaga status) {
		this.status = status;
	}
	public Double getPrecoHora() {
		return precoHora;
	}
	public void setPrecoHora(Double precoHora) {
		this.precoHora = precoHora;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public Estacionamento getEstacionamento() {
		return estacionamento;
	}

	public void setEstacionamento(Estacionamento estacionamento) {
		this.estacionamento = estacionamento;
	}
}
