package com.mackenzie.estacionei.controller;

import com.mackenzie.estacionei.controller.dto.RelatorioDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import com.mackenzie.estacionei.entity.Recibo;
import com.mackenzie.estacionei.repository.ReciboRepository;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/recibos")
public class RecibosController {

    @Autowired
    private ReciboRepository recibosRepository;
    
    @GetMapping
    public ResponseEntity<RelatorioDTO> fechamentoDiario(@RequestParam(required = true, name = "data") String dataString){
        LocalDate data = LocalDate.parse(dataString);
        List<Recibo> recibos = recibosRepository.findByData(data);

        Double total = 0.0;
        for (int i=0; i < recibos.size(); i++) {
            total += recibos.get(i).getValorPago();
        }

        return  ResponseEntity.ok(new RelatorioDTO(total, recibos.size()));
    }
}
