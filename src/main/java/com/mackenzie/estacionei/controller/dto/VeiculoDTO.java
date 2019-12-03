package com.mackenzie.estacionei.controller.dto;

import com.mackenzie.estacionei.entity.Veiculo;

import java.util.List;
import java.util.stream.Collectors;

public class VeiculoDTO {

	private Long idVeiculo;
	private String placa;
	private String marca;
	private String modelo;
	
	public VeiculoDTO(Veiculo veiculo) {
		this.idVeiculo = veiculo.getIdVeiculo();
		this.placa = veiculo.getPlaca();
		this.marca = veiculo.getMarca();
		this.modelo = veiculo.getModelo();
	}

	public Long getIdVeiculo() {
		return idVeiculo;
	}

	public String getPlaca() {
		return placa;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public static List<VeiculoDTO> parse (List<Veiculo> veiculos){
		return veiculos.stream().map(VeiculoDTO::new).collect(Collectors.toList());
	}
}
