package com.mackenzie.estacionei.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.mackenzie.estacionei.entity.Cliente;
import com.mackenzie.estacionei.entity.Veiculo;
import com.mackenzie.estacionei.repository.VeiculoRepository;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class ClienteForm {
	// a classe form eh para diferenciar a classe de retorno de get e post

	@NotNull @NotEmpty @Length(min = 11)
	private String cpf;
	@NotNull @NotEmpty
	private String nome;
	@NotNull @NotEmpty
	private String email;
	@NotNull @NotEmpty @Length(min = 8)
	private String senha;
	@NotNull
	private EnderecoForm endereco;

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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public EnderecoForm getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoForm endereco) {
		this.endereco = endereco;
	}

	public Cliente converter() {
		String senha = DigestUtils.md5DigestAsHex(this.senha.getBytes(StandardCharsets.UTF_8));

		return new Cliente(cpf, nome, email, senha, endereco.converter());
	}
}
