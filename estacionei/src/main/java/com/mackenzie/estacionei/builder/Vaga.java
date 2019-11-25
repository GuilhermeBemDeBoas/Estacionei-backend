package com.mackenzie.estacionei.builder;

public class Vaga {
	
	String idVaga;
	StatusVaga status;
	String precoHora;
	String localizacao;
	public String getIdVaga() {
		return idVaga;
	}
	public void setIdVaga(String idVaga) {
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
