package com.mackenzie.estacionei.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.mackenzie.estacionei.entity.Cliente;
import com.mackenzie.estacionei.entity.Veiculo;
import com.mackenzie.estacionei.repository.VeiculoRepository;

public class ClienteForm {
	// a classe form eh para diferenciar a classe de retorno de get e post

	@NotNull @NotEmpty @Length(min = 11)
	private String cpf;
	@NotNull @NotEmpty
	private String nome;
	@NotNull @NotEmpty
	private String email;
	@NotNull @NotEmpty
	private String placaVeiculo;
	
	
	public String getPlacaVeiculo() {
		return placaVeiculo;
	}
	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Cliente converter(VeiculoRepository veiculoRepository) {
//		Veiculo veiculo = veiculoRepository.findByPlaca(placaVeiculo);
//		return new Cliente(cpf, nome, email, veiculo);
		throw new Error("");
	}
}
