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
	private String senha;
	private List<CartaoDTO> cartoes;
	private List<VeiculoDTO> veiculos;
	private EnderecoDTO endereco;
	
	public ClienteDTO(Cliente cliente) {
		this.idCliente = cliente.getIdCliente();
		this.cpf = cliente.getCpf();
		this.nome = cliente.getNome();
		this.email = cliente.getEmail();
		this.senha = cliente.getSenha();
		this.cartoes = CartaoDTO.parse(cliente.getCartoes());
		this.veiculos = VeiculoDTO.parse(cliente.getVeiculos());
		this.endereco = EnderecoDTO.parse(cliente.getEndereco());
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public String getCpf() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}

	public String getSenha() {
		return senha;
	}

	public String getEmail() {
		return email;
	}

	public List<CartaoDTO> getCartoes() {
		return cartoes;
	}

	public List<VeiculoDTO> getVeiculos() {
		return veiculos;
	}

	public EnderecoDTO getEndereco() {
		return endereco;
	}

	public static List<ClienteDTO> parse (List<Cliente> clientes){
		return clientes.stream().map(ClienteDTO::new).collect(Collectors.toList());
	}

	public static ClienteDTO parse(Cliente cliente) {
		return new ClienteDTO(cliente);
	}

}
