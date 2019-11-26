package com.mackenzie.estacionei.controller;

import com.mackenzie.estacionei.controller.dto.VeiculoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class VeiculosContoller {
    @GetMapping("/clientes/{idCliente}/veiculos")
    public ResponseEntity<List<VeiculoDTO>> listaVeiculo(@PathVariable(name = "idCliente") long idCliente) {
        return ResponseEntity.ok(null);
    }

    @GetMapping("/clientes/{idCliente}/veiculos/{id}")
    public ResponseEntity<VeiculoDTO> buscaVeiculo(@PathVariable(name = "idCliente") long idCliente, @PathVariable long id) {
        return ResponseEntity.ok(null);
    }

    @PostMapping("/clientes/{idCliente}/veiculos")
    public ResponseEntity criaVeiculo(@PathVariable(name = "idCliente") long idCliente, @RequestBody VeiculoDTO veiculo) {
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand("id do veiculo").toUri();

        return ResponseEntity.created(location).build();
    }

    @PutMapping("/clientes/{idCliente}/veiculos/{id}")
    public ResponseEntity atualizaVeiculo(@PathVariable(name = "idCliente") long idCliente, @RequestBody VeiculoDTO veiculo, @PathVariable long id) {
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/clientes/{idCliente}/veiculos/{id}")
    public ResponseEntity deletaVeiculo(@PathVariable(name = "idCliente") long idCliente, @PathVariable long id) {
        return ResponseEntity.noContent().build();
    }
}
