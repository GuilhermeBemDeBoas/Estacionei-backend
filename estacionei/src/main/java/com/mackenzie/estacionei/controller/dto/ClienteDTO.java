package com.mackenzie.estacionei.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.annotation.Id;

import com.mackenzie.estacionei.entity.Cliente;
import com.mackenzie.estacionei.entity.Veiculo;

public class ClienteDTO {
	
	@Id
	private String cpf;
	private String nome;
	private Veiculo veiculo;
	
	public ClienteDTO(Cliente cliente) {
		this.cpf = cliente.getCpf();
		this.nome = cliente.getNome();
		this.veiculo = cliente.getVeiculo();
	}
	
	public String getCpf() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}

	public static List<ClienteDTO> parse (List<Cliente> clientes){
		return clientes.stream().map(ClienteDTO::new).collect(Collectors.toList());
	}

}
