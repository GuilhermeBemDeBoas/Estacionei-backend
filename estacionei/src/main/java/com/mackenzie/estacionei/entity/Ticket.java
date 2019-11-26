package com.mackenzie.estacionei.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import com.mackenzie.estacionei.enums.StatusTicket;

public class Ticket {
	
	@Id
	private Long idTicket;
	private LocalDateTime data;
	private Cliente cliente;
	private Veiculo veiculo;
	private StatusTicket statusTicket = StatusTicket.PENDENTE;
	
	public Ticket (Cliente cliente) {
		this.cliente = cliente;
		this.veiculo = cliente.getVeiculo();
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

}
