package com.mackenzie.estacionei.controller.dto;

import com.mackenzie.estacionei.entity.Estacionamento;

import java.util.List;
import java.util.stream.Collectors;

public class EstacionamentoDTO {
    private Long idEstacionamento;
    private String nome;
    private EnderecoDTO endereco;

    public EstacionamentoDTO(Estacionamento estacionamento) {
        this.idEstacionamento = estacionamento.getIdEstacionamento();
        this.nome = estacionamento.getNome();
        this.endereco = EnderecoDTO.parse(estacionamento.getEndereco());
    }

    public Long getIdEstacionamento() {
        return idEstacionamento;
    }

    public EnderecoDTO getEndereco() {
        return endereco;
    }

    public String getNome() {
        return nome;
    }

    public static List<EstacionamentoDTO> parse (List<Estacionamento> estacionamentos){
        return estacionamentos.stream().map(EstacionamentoDTO::new).collect(Collectors.toList());
    }

    public static EstacionamentoDTO parse(Estacionamento estacionamento) {
        return new EstacionamentoDTO(estacionamento);
    }
}
