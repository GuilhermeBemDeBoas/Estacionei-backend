package com.mackenzie.estacionei.entity;

import java.time.LocalDateTime;

import com.mackenzie.estacionei.enums.StatusTicket;

import javax.persistence.*;

@Entity
public class Ticket {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTicket;
	private LocalDateTime data = LocalDateTime.now();
	private Double valor = 0.0;

	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;
	@ManyToOne
	@JoinColumn(name = "id_veiculo")
	private Veiculo veiculo;
	@ManyToOne
	@JoinColumn(name = "id_vaga")
	private Vaga vaga;

	@Enumerated(EnumType.STRING)
	private StatusTicket statusTicket = StatusTicket.PENDENTE;

	public Ticket() {
	}

	public Ticket (Cliente cliente, Veiculo veiculo, Vaga vaga) {
		this.cliente = cliente;
		this.vaga = vaga;
		this.veiculo = veiculo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setIdTicket(Long idTicket) {
		this.idTicket = idTicket;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public StatusTicket getStatusTicket() {
		return statusTicket;
	}

	public void setStatusTicket(StatusTicket statusTicket) {
		this.statusTicket = statusTicket;
	}


	public Long getIdTicket() {
		return idTicket;
	}

	public Vaga getVaga() {
		return vaga;
	}

	public void setVaga(Vaga vaga) {
		this.vaga = vaga;
	}
}
