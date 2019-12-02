package com.mackenzie.estacionei.entity;

import java.time.LocalDateTime;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.mackenzie.estacionei.enums.StatusPagamento;

public class Pagamento {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPagamento;
	private String valor;
	@Enumerated(EnumType.STRING)
	private StatusPagamento pagar = StatusPagamento.NOK;
	private LocalDateTime dataHoraPagamento = LocalDateTime.now();
	
	public Long getIdPagamento() {
		return idPagamento;
	}
	public void setIdPagamento(Long idPagamento) {
		this.idPagamento = idPagamento;
	}
	
	public LocalDateTime getDataHoraPagamento() {
		return dataHoraPagamento;
	}
	public void setDataHoraPagamento(LocalDateTime dataHoraPagamento) {
		this.dataHoraPagamento = dataHoraPagamento;
	}
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
