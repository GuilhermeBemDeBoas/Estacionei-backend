package com.mackenzie.estacionei.entity;

import java.time.LocalDateTime;

public class Recibos {
	
	private Long idRecibo;
	private LocalDateTime dataHora;
	private Integer valorPago;
	
	
	public Long getIdRecibo() {
		return idRecibo;
	}
	public void setIdRecibo(Long idRecibo) {
		this.idRecibo = idRecibo;
	}
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	public Integer getValorPago() {
		return valorPago;
	}
	public void setValorPago(Integer valorPago) {
		this.valorPago = valorPago;
	}

}
