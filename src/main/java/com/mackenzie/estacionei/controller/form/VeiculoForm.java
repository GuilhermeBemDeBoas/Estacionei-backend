package com.mackenzie.estacionei.controller.form;

import com.mackenzie.estacionei.entity.Cliente;
import com.mackenzie.estacionei.entity.Veiculo;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class VeiculoForm {
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

    public Veiculo converter(Cliente cliente) {
        return new Veiculo(placa, marca, modelo, cliente);
    }
}
