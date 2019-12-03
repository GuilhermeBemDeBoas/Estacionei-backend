package com.mackenzie.estacionei.controller.dto;

import com.mackenzie.estacionei.entity.Vaga;

import java.util.List;
import java.util.stream.Collectors;

public class VagaDTO {
    private Double precoHora;
    private String localizacao;

    public VagaDTO(Vaga vaga) {
        this.precoHora = vaga.getPrecoHora();
        this.localizacao = vaga.getLocalizacao();
    }

    public Double getPrecoHora() {
        return precoHora;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public static List<VagaDTO> parse (List<Vaga> vagas){
        return vagas.stream().map(VagaDTO::new).collect(Collectors.toList());
    }
}
