package com.mackenzie.estacionei.controller.dto;

import com.mackenzie.estacionei.entity.Estacionamento;

public class DetalharEstacionamentoDTO {

    private Long idEstacionamento;
    private String nome;

    public DetalharEstacionamentoDTO(Estacionamento estacionamento) {
        this.idEstacionamento = estacionamento.getIdEstacionamento();
        this.nome = estacionamento.getNome();
    }

    public Long getIdEstacionamento() {
        return idEstacionamento;
    }

    public String getNome() {
        return nome;
    }
}
