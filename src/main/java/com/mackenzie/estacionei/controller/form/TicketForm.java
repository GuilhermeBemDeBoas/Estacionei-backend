package com.mackenzie.estacionei.controller.form;

import com.mackenzie.estacionei.entity.Cliente;
import com.mackenzie.estacionei.entity.Ticket;
import com.mackenzie.estacionei.entity.Vaga;
import com.mackenzie.estacionei.entity.Veiculo;

import javax.validation.constraints.NotNull;

public class TicketForm {
    @NotNull
    private Long idCliente;
    @NotNull
    private Long idVeiculo;
    @NotNull
    private Long idVaga;

    public TicketForm(Long idCliente, Long idVeiculo, Long idVaga) {
        this.idCliente = idCliente;
        this.idVeiculo = idVeiculo;
        this.idVaga = idVaga;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Long getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(Long idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public Long getIdVaga() {
        return idVaga;
    }

    public void setIdVaga(Long idVaga) {
        this.idVaga = idVaga;
    }

    public Ticket converter(Cliente cliente, Veiculo veiculo, Vaga vaga) {
        return new Ticket(cliente, veiculo, vaga);
    }
}
