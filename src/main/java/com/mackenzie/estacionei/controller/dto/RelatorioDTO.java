package com.mackenzie.estacionei.controller.dto;

public class RelatorioDTO {
    private Double valorTotal;
    private Integer quantidade;

    public RelatorioDTO(Double valorTotal, Integer quantidade) {
        this.valorTotal = valorTotal;
        this.quantidade = quantidade;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
