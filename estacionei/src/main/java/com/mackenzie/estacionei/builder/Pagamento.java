package com.mackenzie.estacionei.builder;

import java.time.LocalDateTime;

public class Pagamento {

	String valor;
	StatusPagamento pagar;
	LocalDateTime dataHoraPagamento;
	
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public StatusPagamento getPagar() {
		return pagar;
	}
	public void setPagar(StatusPagamento pagar) {
		this.pagar = pagar;
	}
	
}
