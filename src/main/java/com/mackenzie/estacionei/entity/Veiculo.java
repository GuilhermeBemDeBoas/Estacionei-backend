package com.mackenzie.estacionei.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Veiculo {
	
	@Id
	private String placa;
	private String marca;
	private String modelo;
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
