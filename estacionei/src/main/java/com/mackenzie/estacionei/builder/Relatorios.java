package com.mackenzie.estacionei.builder;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Relatorios {
	
	ArrayList<Recibos> recibos;
	LocalDateTime data;
	LocalDateTime horaPagamento;

	public ArrayList<Recibos> getRecibos() {
		return recibos;
	}

	public void setRecibos(ArrayList<Recibos> recibos) {
		this.recibos = recibos;
	}

}
