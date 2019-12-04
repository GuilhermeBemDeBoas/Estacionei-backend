package com.mackenzie.estacionei.controller.form;

import javax.validation.constraints.NotNull;

public class PagamentoForm {
    @NotNull
    private Double valor;

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
