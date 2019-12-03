package com.mackenzie.estacionei.controller.form;

import com.mackenzie.estacionei.entity.Endereco;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class AtualizaEnderecoForm {
    @NotNull
    @NotEmpty
    private String cep;
    @NotNull @NotEmpty
    private int numero;
    @NotNull @NotEmpty
    private String logradouro;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Endereco atualizar(Endereco previousEndereco) {
        previousEndereco.setCep(this.cep);
        previousEndereco.setLogradouro(this.logradouro);
        previousEndereco.setNumero(this.numero);

        return previousEndereco;
    }
}
