package com.mackenzie.estacionei.controller;

import com.mackenzie.estacionei.controller.dto.RecibosDTO;
import com.mackenzie.estacionei.controller.dto.TicketDTO;
import com.mackenzie.estacionei.controller.form.PagamentoForm;
import com.mackenzie.estacionei.controller.form.TicketForm;
import com.mackenzie.estacionei.entity.*;
import com.mackenzie.estacionei.enums.StatusTicket;
import com.mackenzie.estacionei.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Optional;

@RestController
@RequestMapping("/tickets")
public class TicketController {
    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private VeiculoRepository veiculoRepository;

    @Autowired
    private VagaRepository vagaRepository;

    @Autowired
    private ReciboRepository reciboRepository;

    @PostMapping
    public ResponseEntity<TicketDTO> gravarTicket(@RequestBody @Valid TicketForm form, UriComponentsBuilder uriBuilder) {
        Optional<Cliente> cliente = clienteRepository.findById(form.getIdCliente());
        Optional<Veiculo> veiculo = veiculoRepository.findById(form.getIdVeiculo());
        Optional<Vaga> vaga = vagaRepository.findById(form.getIdVaga());

        if (!cliente.isPresent() || !veiculo.isPresent() || !vaga.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        Ticket ticket = form.converter(cliente.get(), veiculo.get(), vaga.get());
        ticketRepository.save(ticket);
        URI uri = uriBuilder.path("/tickets").buildAndExpand(ticket.getIdTicket()).toUri();

        return ResponseEntity.created(uri).body(new TicketDTO(ticket));
    }

    @GetMapping("/{id}")
    public ResponseEntity<TicketDTO> buscaTicket(@PathVariable("id") Long id) {
        Optional<Ticket> ticket = ticketRepository.findById(id);
        if(ticket.isPresent()) {
            return ResponseEntity.ok(TicketDTO.parse(ticket.get()));
        }

        return ResponseEntity.notFound().build();
    }

    @PatchMapping("/{id}/calcularPagamento")
    public ResponseEntity<TicketDTO> calculaPagamento(@PathVariable("id") Long id) {
        Optional<Ticket> optional = ticketRepository.findById(id);
        if(!optional.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        Ticket ticket = optional.get();
        LocalDateTime now = LocalDateTime.now();
        Long hoursQuantity = (long) Math.ceil(((double) Duration.between(ticket.getData(), now).toMillis()) / (360 * 1000));
        Double valorTotal = hoursQuantity * ticket.getVaga().getPrecoHora();
        ticket.setValor(valorTotal);
        ticketRepository.save(ticket);

        return ResponseEntity.ok(TicketDTO.parse(ticket));
    }

    @PatchMapping("/{id}/pagar")
    public ResponseEntity<RecibosDTO> pagar(@PathVariable("id") Long id, @RequestBody @Valid PagamentoForm pagamento) {
        Optional<Ticket> optional = ticketRepository.findById(id);
        if(!optional.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        Ticket ticket = optional.get();
        LocalDateTime now = LocalDateTime.now();
        Long hoursQuantity = (long) Math.ceil(((double) Duration.between(ticket.getData(), now).toMillis()) / (360 * 1000));
        Double valorTotal = hoursQuantity * ticket.getVaga().getPrecoHora();

        if (ticket.getValor() > pagamento.getValor() && valorTotal > pagamento.getValor()) {
            return ResponseEntity.badRequest().build();
        }

        Recibo recibo = new Recibo(LocalDateTime.now(), pagamento.getValor());
        reciboRepository.save(recibo);

        ticket.setStatusTicket(StatusTicket.PAGO);
        ticketRepository.save(ticket);

        return ResponseEntity.ok(RecibosDTO.parse(recibo));
    }
}
