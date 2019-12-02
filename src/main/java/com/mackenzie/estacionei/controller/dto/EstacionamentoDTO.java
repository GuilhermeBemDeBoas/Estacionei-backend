package com.mackenzie.estacionei.controller.dto;

import com.mackenzie.estacionei.entity.Estacionamento;

import java.util.List;
import java.util.stream.Collectors;

public class EstacionamentoDTO {
    private Long id;
    private String nome;
    private String endereco;

    public EstacionamentoDTO(Estacionamento estacionamento) {
        this.id = estacionamento.getIdEstacionamento();
        this.nome = estacionamento.getNomeEstacionameto();
        this.endereco = estacionamento.getEnderecoEstacionamento();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public static List<EstacionamentoDTO> parse (List<Estacionamento> estacionamentos){
        return estacionamentos.stream().map(EstacionamentoDTO::new).collect(Collectors.toList());
    }
}
