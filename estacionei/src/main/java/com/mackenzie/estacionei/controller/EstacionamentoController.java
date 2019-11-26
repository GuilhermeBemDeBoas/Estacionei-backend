package com.mackenzie.estacionei.controller;

import com.mackenzie.estacionei.DTO.EstacionamentoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

@RestController
public class EstacionamentoController {
    @GetMapping("/estacionamentos")
    public ResponseEntity<List<EstacionamentoDTO>> listaEstacionamento() {
        return ResponseEntity.ok(null);
    }

    @GetMapping("/estacionamentos/{id}")
    public ResponseEntity<EstacionamentoDTO> buscaVeiculo(@PathVariable long id) {
        return ResponseEntity.ok(null);
    }

    @PostMapping("/estacionamentos")
    public ResponseEntity criaEstacionamento(@RequestBody EstacionamentoDTO estacionamento) {
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand("id do estacionamento").toUri();

        return ResponseEntity.created(location).build();
    }

    @PutMapping("/estacionamentos/{id}")
    public ResponseEntity atualizaEstacionamento(@RequestBody EstacionamentoDTO estacionamento, @PathVariable long id) {
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/estacionamentos/{id}")
    public ResponseEntity deletaEstacionamento(@PathVariable long id) {
        return ResponseEntity.noContent().build();
    }
}
