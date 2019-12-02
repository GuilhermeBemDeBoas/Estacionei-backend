package com.mackenzie.estacionei.controller.form;

import com.mackenzie.estacionei.entity.Estacionamento;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class EstacionamentoForm {

    @NotNull @NotEmpty
    private String nome;
    @NotNull @NotEmpty
    private String endereco;

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

    public Estacionamento converter() {
        return new Estacionamento(nome, endereco);
    }
}
