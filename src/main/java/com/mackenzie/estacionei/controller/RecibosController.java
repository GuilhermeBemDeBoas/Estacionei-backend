package com.mackenzie.estacionei.controller;

import org.springframework.web.bind.annotation.RestController;
import com.mackenzie.estacionei.entity.Recibos;
import com.mackenzie.estacionei.repository.ReciboRepository;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/recibos")
public class RecibosController {
    
    private float total=0;
    @Autowired
    private ReciboRepository recibosRepository;
    
    @GetMapping
    public float fechamentoDiario(@RequestParam LocalDate data){
        if(data == null) {
           // TODO throw Exception;
        } else {
            List<Recibos> recibos = recibosRepository.findByData(data);
            for (int i=0; recibos.size()<i;i++) {
                total+=recibos.indexOf(i);
                
            }
        }
        return total;
    }
}
