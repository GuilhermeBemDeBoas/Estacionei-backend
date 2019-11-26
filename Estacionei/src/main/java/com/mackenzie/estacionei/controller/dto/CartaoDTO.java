package com.mackenzie.estacionei.controller.dto;

import com.mackenzie.estacionei.entity.Cartao;

import java.util.List;
import java.util.stream.Collectors;

public class CartaoDTO {
    private String numCartao;
    private String cvv;
    private String nomeCartao;

    public CartaoDTO(Cartao cartao) {
        this.numCartao = cartao.getNumCartao();
        this.cvv = cartao.getCvv();
        this.nomeCartao = cartao.getNomeCartao();
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getNomeCartao() {
        return nomeCartao;
    }

    public void setNomeCartao(String nomeCartao) {
        this.nomeCartao = nomeCartao;
    }

    public static List<CartaoDTO> parse (List<Cartao> cartoes){
        return cartoes.stream().map(CartaoDTO::new).collect(Collectors.toList());
    }
}
