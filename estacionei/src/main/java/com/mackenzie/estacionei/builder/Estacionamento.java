package com.mackenzie.estacionei.builder;

import java.util.ArrayList;

public class Estacionamento {
	
	
	String nomeEstacionameto;
	String enderecoEstacionamento;
	
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
	public ArrayList<Vagas> getVagas() {
		return vagas;
	}
	public void setVagas(ArrayList<Vagas> vagas) {
		this.vagas = vagas;
	}
	ArrayList <Vagas> vagas;
	

}
