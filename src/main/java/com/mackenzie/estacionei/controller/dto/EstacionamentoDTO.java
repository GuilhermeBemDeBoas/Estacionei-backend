package com.mackenzie.estacionei.controller.dto;

import com.mackenzie.estacionei.entity.Estacionamento;

import java.util.List;
import java.util.stream.Collectors;

public class EstacionamentoDTO {
    private Long idEstacionamento;
    private String nome;

    public EstacionamentoDTO(Estacionamento estacionamento) {
        this.idEstacionamento = estacionamento.getIdEstacionamento();
        this.nome = estacionamento.getNome();
    }

    public Long getIdEstacionamento() {
        return idEstacionamento;
    }

    public String getNome() {
        return nome;
    }

    public static List<EstacionamentoDTO> parse (List<Estacionamento> estacionamentos){
        return estacionamentos.stream().map(EstacionamentoDTO::new).collect(Collectors.toList());
    }
}
