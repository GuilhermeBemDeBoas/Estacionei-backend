package com.mackenzie.estacionei.controller.dto;

import com.mackenzie.estacionei.entity.Veiculo;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class DetalharVeiculoDTO {
    @NotNull
    @NotEmpty
    private String marca;
    @NotNull @NotEmpty
    private String modelo;
    @NotNull @NotEmpty
    private String placa;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public DetalharVeiculoDTO(Veiculo veiculo) {
        this.marca = veiculo.getMarca();
        this.modelo = veiculo.getModelo();
        this.placa = veiculo.getPlaca();
    }
}
