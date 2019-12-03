package com.mackenzie.estacionei.controller.form;

import com.mackenzie.estacionei.entity.Vaga;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class VagaForm {
    @NotNull @NotEmpty
    private String precoHora;
    @NotNull
    @NotEmpty
    private String localizacao;

    public String getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(String precoHora) {
        this.precoHora = precoHora;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Vaga converter() {
        return new Vaga(precoHora, localizacao);
    }
}
