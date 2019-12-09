package com.mackenzie.estacionei.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Recibo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRecibo;
	private LocalDateTime dataHora;
	private Double valorPago;

	public Recibo() {
	}

	public Recibo(LocalDateTime dataHora, Double valorPago) {
		this.dataHora = dataHora;
		this.valorPago = valorPago;
	}

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
	public Double getValorPago() {
		return valorPago;
	}
	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
	}

}
