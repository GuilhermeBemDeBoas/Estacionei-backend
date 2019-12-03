package com.mackenzie.estacionei.entity;

import javax.persistence.*;

import com.mackenzie.estacionei.enums.StatusVaga;

@Entity
public class Vaga {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVaga;
	@Enumerated(EnumType.STRING)
	private StatusVaga status = StatusVaga.LIVRE;
	private String precoHora;
	private String localizacao;
	
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
	public String getPrecoHora() {
		return precoHora;
	}
	public void setPrecoHora(String precoHora) {
		this.precoHora = precoHora;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

}
