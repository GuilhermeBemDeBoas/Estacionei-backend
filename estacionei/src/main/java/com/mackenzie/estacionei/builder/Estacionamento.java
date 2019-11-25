package com.mackenzie.estacionei.builder;

import java.util.ArrayList;

public class Estacionamento {
	
	
	String nomeEstacionameto;
	String enderecoEstacionamento;
	ArrayList <Vaga> vagas;
	
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
