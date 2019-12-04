package com.mackenzie.estacionei.controller.dto;

import com.mackenzie.estacionei.entity.Recibo;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class RecibosDTO {
    private Long idRecibo;
    private LocalDateTime dataHora;
    private Integer valorPago;

    public RecibosDTO(Recibo recibo) {
        this.idRecibo = idRecibo;
        this.dataHora = dataHora;
        this.valorPago = valorPago;
    }
    
    public RecibosDTO() {
        
    }

    public Long getIdRecibo() {
	return idRecibo;
    }
    public void setIdRecibo(Long idRecibo) {
        this.idRecibo = idRecibo;
    }
    public LocalDateTime getDataHora() {
	return dataHora;
    }
    public void setDataHora(LocalDateTime dataHora) {
	this.dataHora = dataHora;
    }
    public Integer getValorPago() {
	return valorPago;
    }
    public void setValorPago(Integer valorPago) {
	this.valorPago = valorPago;
    }
    
     public static List<RecibosDTO> parse (List<Recibo> recibos){
        return recibos.stream().map(RecibosDTO::new).collect(Collectors.toList());
    }
}
