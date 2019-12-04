package com.mackenzie.estacionei.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Relatorios {
	
	private ArrayList<Recibo> recibos;
	private LocalDateTime data;
	private LocalDateTime horaPagamento;

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public LocalDateTime getHoraPagamento() {
		return horaPagamento;
	}

	public void setHoraPagamento(LocalDateTime horaPagamento) {
		this.horaPagamento = horaPagamento;
	}

	public ArrayList<Recibo> getRecibos() {
		return recibos;
	}

	public void setRecibos(ArrayList<Recibo> recibos) {
		this.recibos = recibos;
	}

}
