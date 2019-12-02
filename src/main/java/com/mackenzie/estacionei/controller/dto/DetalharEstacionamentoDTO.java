package com.mackenzie.estacionei.controller.dto;

import com.mackenzie.estacionei.entity.Estacionamento;

public class DetalharEstacionamentoDTO {

    private Long id;
    private String nome;
    private String endereco;

    public DetalharEstacionamentoDTO(Estacionamento estacionamento) {
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
}
