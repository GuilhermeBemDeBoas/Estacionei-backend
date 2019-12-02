package com.mackenzie.estacionei.controller.form;

import com.mackenzie.estacionei.entity.Estacionamento;
import com.mackenzie.estacionei.repository.EstacionamentoRepository;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class AtualizaEstacionamentoForm {
    @NotNull
    @NotEmpty
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

    public Estacionamento atualizar(Long id, EstacionamentoRepository estacionamentoRepository) {
        Estacionamento estacionamento = estacionamentoRepository.getOne(id);
        estacionamento.setNomeEstacionameto(this.nome);
        estacionamento.setEnderecoEstacionamento(this.endereco);

        return estacionamento;
    }
}
