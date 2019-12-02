package com.mackenzie.estacionei.controller.dto;

import com.mackenzie.estacionei.entity.Veiculo;

import java.util.List;
import java.util.stream.Collectors;

public class VeiculoDTO {
	
	private String placa;
	private String marca;
	private String modelo;
	
	public VeiculoDTO(Veiculo veiculo) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public static List<VeiculoDTO> parse (List<Veiculo> veiculos){
		return veiculos.stream().map(VeiculoDTO::new).collect(Collectors.toList());
	}
}
