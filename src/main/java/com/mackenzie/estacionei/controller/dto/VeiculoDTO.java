package com.mackenzie.estacionei.controller.dto;

import com.mackenzie.estacionei.entity.Veiculo;

public class VeiculoDTO {
	
	private String placa;
	private String marca;
	private String modelo;
	
	public VeiculoDTO(Veiculo veiculo) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	
}
