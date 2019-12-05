package com.mackenzie.estacionei.controller.form;

import com.mackenzie.estacionei.entity.Estacionamento;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.stream.Collectors;

public class EstacionamentoForm {

    @NotNull @NotEmpty
    private String nome;
    @NotNull
    private EnderecoForm endereco;
    @NotNull
    private List<VagaForm> vagas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EnderecoForm getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoForm endereco) {
        this.endereco = endereco;
    }

    public List<VagaForm> getVagas() {
        return vagas;
    }

    public void setVagas(List<VagaForm> vagas) {
        this.vagas = vagas;
    }

    public Estacionamento converter() {
        return new Estacionamento(nome, endereco.converter(), vagas.stream().map(vaga -> vaga.converter()).collect(Collectors.toList()));
    }
}
