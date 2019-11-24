package com.mackenzie.estacionei.builder;

import java.time.LocalDateTime;

public class Ticket {
	String idTicket;
	LocalDateTime data;
	Veiculo veiculo;
	String statusTicket;

	public String getIdTicket() {
		return idTicket;
	}
	
	public void setIdTicket(String idticket) {
		this.idTicket = idticket;
	}
}
