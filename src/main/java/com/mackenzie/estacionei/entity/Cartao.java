package com.mackenzie.estacionei.entity;

import javax.persistence.*;

@Entity
public class Cartao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCartao;
	private String numCartao;
	private String cvv;
	private String nomeCartao;

	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;

	public Cartao() {
	}

	public String getNumCartao() {
		return numCartao;
	}
	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public String getNomeCartao() {
		return nomeCartao;
	}
	public void setNomeCartao(String nomeCartao) {
		this.nomeCartao = nomeCartao;
	}
	
}
