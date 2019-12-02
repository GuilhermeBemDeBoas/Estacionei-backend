package com.mackenzie.estacionei.controller;

import com.mackenzie.estacionei.controller.dto.VeiculoDTO;
import com.mackenzie.estacionei.controller.form.AtualizaVeiculoForm;
import com.mackenzie.estacionei.controller.form.VeiculoForm;
import com.mackenzie.estacionei.entity.Veiculo;
import com.mackenzie.estacionei.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes/{idCliente}/veiculos")
public class VeiculosController {
    @Autowired
    private VeiculoRepository veiculoRepository;

    @GetMapping
    public List<VeiculoDTO> listaVeiculo(@PathVariable("idCliente") String placa){
        if(placa == null) {
            List<Veiculo> veiculos = veiculoRepository.findAll();
            return VeiculoDTO.parse(veiculos);
        }else {
            Veiculo veiculos = veiculoRepository.findByPlaca(placa);
            return VeiculoDTO.parse(veiculos);
        }
    }

    @PostMapping
    @Transactional
    public ResponseEntity<VeiculoDTO> gravarVeiculo(@PathVariable("idCliente") String cpf, @RequestBody @Valid VeiculoForm form, UriComponentsBuilder uriBuilder) {


        Veiculo veiculo = form.converter();
        veiculoRepository.save(veiculo);

        URI uri = uriBuilder.path("/veiculos/{id}").buildAndExpand(veiculo.getPlaca()).toUri();
        return ResponseEntity.created(uri).body(new VeiculoDTO(veiculo));
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetalharVeiculoDTO> detalharVeiculo(@PathVariable("idCliente") String cpf, @PathVariable("id") Long id) {
        Optional<Veiculo> veiculo = veiculoRepository.findById(id);
        if(veiculo.isPresent()) {
            return ResponseEntity.ok(new DetalharVeiculoDTO(veiculo.get()));
        }

        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<VeiculoDTO> atualizarVeiculo(@PathVariable("idCliente") String cpf, @PathVariable("id") Long id, @RequestBody @Valid AtualizaVeiculoForm form){
        Optional<Veiculo> optional = veiculoRepository.findById(id);
        if(optional.isPresent()) {

            Veiculo veiculo = form.atualizar(id, veiculoRepository);
            return ResponseEntity.ok(new VeiculoDTO(veiculo));
        }

        return ResponseEntity.notFound().build();

    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<?> deletarVeiculo(@PathVariable("idCliente") String cpf, @PathVariable Long id){
        Optional<Veiculo> optional = veiculoRepository.findById(id);
        if(optional.isPresent()) {
            veiculoRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }

        return ResponseEntity.notFound().build();


    }
}
