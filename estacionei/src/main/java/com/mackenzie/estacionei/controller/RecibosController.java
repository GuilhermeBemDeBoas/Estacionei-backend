package com.mackenzie.estacionei.controller;

import com.mackenzie.estacionei.controller.dto.RecibosDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class RecibosController {
    @GetMapping("/recibos/{id}")
    public ResponseEntity<List<RecibosDTO>> listaRecibo(@PathVariable long id) {
        return ResponseEntity.ok(null);
    }

    @PostMapping("/recibos")
    public ResponseEntity criaRecibo(@RequestBody RecibosDTO recibo) {
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand("id do recibo").toUri();

        return ResponseEntity.created(location).build();
    }
}
