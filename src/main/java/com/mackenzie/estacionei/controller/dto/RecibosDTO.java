package com.mackenzie.estacionei.controller.dto;

import com.mackenzie.estacionei.entity.Recibo;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class RecibosDTO {
    private Long idRecibo;
    private LocalDateTime dataHora;
    private Double valorPago;

    public RecibosDTO(Recibo recibo) {
        this.idRecibo = recibo.getIdRecibo();
        this.dataHora = recibo.getDataHora();
        this.valorPago = recibo.getValorPago();
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
    public Double getValorPago() {
	return valorPago;
    }
    public void setValorPago(Double valorPago) {
	this.valorPago = valorPago;
    }
    
     public static List<RecibosDTO> parse (List<Recibo> recibos){
        return recibos.stream().map(RecibosDTO::new).collect(Collectors.toList());
    }

    public static RecibosDTO parse(Recibo recibo) {
        return new RecibosDTO(recibo);
    }
}
