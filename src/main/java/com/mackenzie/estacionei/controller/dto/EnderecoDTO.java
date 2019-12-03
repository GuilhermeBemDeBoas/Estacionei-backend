package com.mackenzie.estacionei.controller.dto;

import com.mackenzie.estacionei.entity.Endereco;

public class EnderecoDTO {
    private Long idEndereco;
    private String cep;
    private int numero;
    private String logradouro;

    public EnderecoDTO(Endereco endereco) {
        this.idEndereco = endereco.getIdEndereco();
        this.cep = endereco.getCep();
        this.numero = endereco.getNumero();
        this.logradouro = endereco.getLogradouro();
    }

    public Long getIdEndereco() {
        return idEndereco;
    }

    public String getCep() {
        return cep;
    }

    public int getNumero() {
        return numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public static EnderecoDTO parse(Endereco endereco) {
        return new EnderecoDTO(endereco);
    }
}
