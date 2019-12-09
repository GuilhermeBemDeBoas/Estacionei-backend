package com.mackenzie.estacionei.controller;

import com.mackenzie.estacionei.controller.dto.EstacionamentoDTO;
import com.mackenzie.estacionei.controller.form.AtualizaEstacionamentoForm;
import com.mackenzie.estacionei.controller.form.EstacionamentoForm;
import com.mackenzie.estacionei.entity.Estacionamento;
import com.mackenzie.estacionei.repository.EstacionamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estacionamentos")
public class EstacionamentoController {

    @Autowired
    private EstacionamentoRepository estacionamentoRepository;

    @GetMapping
    public List<EstacionamentoDTO> listaEstacionamento(@RequestParam(required = false) String nome){
        if(nome == null) {
            List<Estacionamento> estacionamentos = estacionamentoRepository.findAll();
            return EstacionamentoDTO.parse(estacionamentos);
        }else {
            List<Estacionamento> estacionamentos = estacionamentoRepository.findByNomeContainingIgnoreCase(nome);
            return EstacionamentoDTO.parse(estacionamentos);
        }
    }

    @PostMapping
    @Transactional
    public ResponseEntity<EstacionamentoDTO> gravarEstacionamento(@RequestBody @Valid EstacionamentoForm form, UriComponentsBuilder uriBuilder) {
        Estacionamento estacionamento = form.converter();
        estacionamentoRepository.save(estacionamento);

        URI uri = uriBuilder.path("/estacionamentos/{id}").buildAndExpand(estacionamento.getIdEstacionamento()).toUri();
        return ResponseEntity.created(uri).body(new EstacionamentoDTO(estacionamento));
    }

    @GetMapping("/{id}")
    public ResponseEntity<EstacionamentoDTO> detalharEstacionamento(@PathVariable("id") Long id) {
        Optional<Estacionamento> estacionamento = estacionamentoRepository.findById(id);
        if(estacionamento.isPresent()) {
            return ResponseEntity.ok(EstacionamentoDTO.parse(estacionamento.get()));
        }

        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<EstacionamentoDTO> atualizarEstacionamento(@PathVariable("id") Long id, @RequestBody @Valid AtualizaEstacionamentoForm form){
        Optional<Estacionamento> optional = estacionamentoRepository.findById(id);
        if(optional.isPresent()) {

            Estacionamento estacionamento = form.atualizar(optional.get());
            return ResponseEntity.ok(new EstacionamentoDTO(estacionamento));
        }

        return ResponseEntity.notFound().build();

    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<?> deletarEstacionamento(@PathVariable Long id){
        Optional<Estacionamento> optional = estacionamentoRepository.findById(id);
        if(optional.isPresent()) {
            estacionamentoRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }

        return ResponseEntity.notFound().build();


    }

}
