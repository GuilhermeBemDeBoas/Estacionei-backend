package com.mackenzie.estacionei.controller.form;

import com.mackenzie.estacionei.entity.Estacionamento;
import com.mackenzie.estacionei.repository.EstacionamentoRepository;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class AtualizaEstacionamentoForm {
    @NotNull
    @NotEmpty
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estacionamento atualizar(Long id, EstacionamentoRepository estacionamentoRepository) {
        Estacionamento estacionamento = estacionamentoRepository.getOne(id);
        estacionamento.setNome(this.nome);

        return estacionamento;
    }
}
