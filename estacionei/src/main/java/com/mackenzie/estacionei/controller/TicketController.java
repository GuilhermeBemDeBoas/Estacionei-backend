package com.mackenzie.estacionei.controller;

import com.mackenzie.estacionei.controller.dto.TicketDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class TicketController {
    @GetMapping("/tickets/{id}")
    public ResponseEntity<List<TicketDTO>> listaTicket(@PathVariable long id) {
        return ResponseEntity.ok(null);
    }

    @PostMapping("/tickets")
    public ResponseEntity criaTicket(@RequestBody TicketDTO ticket) {
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand("id do ticket").toUri();

        return ResponseEntity.created(location).build();
    }

    @PostMapping("/tickets/{id}")
    public ResponseEntity calculaPagamento() {
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand("id do ticket").toUri();

        return ResponseEntity.created(location).build();
    }
}
