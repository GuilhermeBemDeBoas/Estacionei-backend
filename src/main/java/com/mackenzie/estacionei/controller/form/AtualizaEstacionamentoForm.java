package com.mackenzie.estacionei.controller.form;

import com.mackenzie.estacionei.entity.Estacionamento;
import com.mackenzie.estacionei.repository.EstacionamentoRepository;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class AtualizaEstacionamentoForm {
    @NotNull
    @NotEmpty
    private String nome;
    @NotNull
    private AtualizaEnderecoForm endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public AtualizaEnderecoForm getEndereco() {
        return endereco;
    }

    public void setEndereco(AtualizaEnderecoForm endereco) {
        this.endereco = endereco;
    }

    public Estacionamento atualizar(Estacionamento estacionamento) {
        estacionamento.setNome(this.nome);
        estacionamento.setEndereco(this.endereco.atualizar(estacionamento.getEndereco()));

        return estacionamento;
    }
}
