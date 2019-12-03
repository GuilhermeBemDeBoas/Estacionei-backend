package com.mackenzie.estacionei.controller.dto;

import com.mackenzie.estacionei.entity.Ticket;
import com.mackenzie.estacionei.enums.StatusTicket;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class TicketDTO {

    private Long idTicket;
    private LocalDateTime data;
    private Double valor;
    private StatusTicket statusTicket = StatusTicket.PENDENTE;

    public TicketDTO(Ticket ticket) {
        this.idTicket = ticket.getIdTicket();
        this.data = ticket.getData();
        this.valor = ticket.getValor();
    }

    public Long getIdTicket() {
        return idTicket;
    }

    public Double getValor() {
        return valor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public StatusTicket getStatusTicket(){
        return statusTicket;
    }

    public static List<TicketDTO> parse (List<Ticket> tickets){
        return tickets.stream().map(TickerDTO::new).collect(Collectors.toList());
    }
}