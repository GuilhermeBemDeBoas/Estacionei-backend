package com.mackenzie.estacionei.entity;

import java.util.ArrayList;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Estacionamento {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEstacionamento;
	private String nomeEstacionameto;
	private String enderecoEstacionamento;
	private ArrayList <Vaga> vagas;
	
	public Estacionamento(String nomeEstacionamento, Endereco endereco) {
		this.nomeEstacionameto = nomeEstacionamento;
		this.enderecoEstacionamento = endereco.getCep();
	}
	
	public Long getIdEstacionamento() {
		return idEstacionamento;
	}
	public void setIdEstacionamento(Long idEstacionamento) {
		this.idEstacionamento = idEstacionamento;
	}
	public String getNomeEstacionameto() {
		return nomeEstacionameto;
	}
	public void setNomeEstacionameto(String nomeEstacionameto) {
		this.nomeEstacionameto = nomeEstacionameto;
	}
	public String getEnderecoEstacionamento() {
		return enderecoEstacionamento;
	}
	public void setEnderecoEstacionamento(String enderecoEstacionamento) {
		this.enderecoEstacionamento = enderecoEstacionamento;
	}
	public ArrayList<Vaga> getVagas() {
		return vagas;
	}
	public void setVagas(ArrayList<Vaga> vagas) {
		this.vagas = vagas;
	}

}
