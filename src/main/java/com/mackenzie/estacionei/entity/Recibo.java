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
