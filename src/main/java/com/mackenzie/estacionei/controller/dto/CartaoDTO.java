package com.mackenzie.estacionei.controller.dto;

import com.mackenzie.estacionei.entity.Cartao;

import java.util.List;
import java.util.stream.Collectors;

public class CartaoDTO {
    private Long idCartao;
    private String numCartao;
    private String cvv;
    private String nomeCartao;

    public CartaoDTO(Cartao cartao) {
        this.idCartao = cartao.getIdCartao();
        this.numCartao = cartao.getNumCartao();
        this.cvv = cartao.getCvv();
        this.nomeCartao = cartao.getNomeCartao();
    }

    public Long getIdCartao() {
        return idCartao;
    }

    public String getNumCartao() {
        return numCartao;
    }

    public String getCvv() {
        return cvv;
    }

    public String getNomeCartao() {
        return nomeCartao;
    }

    public static List<CartaoDTO> parse (List<Cartao> cartaos){
        return cartaos.stream().map(CartaoDTO::new).collect(Collectors.toList());
    }
}
