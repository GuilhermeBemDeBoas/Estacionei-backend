package com.mackenzie.estacionei.controller;

import com.mackenzie.estacionei.controller.dto.TicketDTO;
import com.mackenzie.estacionei.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tickets")
public class TicketController {
    @Autowired
    private TicketRepository ticketRepository;

    @PostMapping
    public ResponseEntity<TicketDTO> gravarTicket() {
        throw new Error("");
    }
}
