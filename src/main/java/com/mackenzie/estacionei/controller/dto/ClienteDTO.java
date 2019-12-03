package com.mackenzie.estacionei.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.annotation.Id;

import com.mackenzie.estacionei.entity.Cliente;

public class ClienteDTO {
	// a classe DTO sera o retorno ao cliente 

	private Long idCliente;
	private String cpf;
	private String nome;
	private String email;
	
	public ClienteDTO(Cliente cliente) {
		this.idCliente = cliente.getIdCliente();
		this.cpf = cliente.getCpf();
		this.nome = cliente.getNome();
		this.email = cliente.getEmail();
	}
	
	public String getCpf() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public static List<ClienteDTO> parse (List<Cliente> clientes){
		return clientes.stream().map(ClienteDTO::new).collect(Collectors.toList());
	}

}
