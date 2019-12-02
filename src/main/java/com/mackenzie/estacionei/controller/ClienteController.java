package com.mackenzie.estacionei.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.mackenzie.estacionei.controller.dto.ClienteDTO;
import com.mackenzie.estacionei.controller.dto.DetalharClienteDTO;
import com.mackenzie.estacionei.controller.form.AtualizaClienteForm;
import com.mackenzie.estacionei.controller.form.ClienteForm;
import com.mackenzie.estacionei.entity.Cliente;
import com.mackenzie.estacionei.repository.ClienteRepository;
import com.mackenzie.estacionei.repository.VeiculoRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private VeiculoRepository veiculoRepository;
	
	@GetMapping
	public List<ClienteDTO> listaCliente(@RequestParam(required = false) String cpf){
		if(cpf == null) {
			List<Cliente> clientes = clienteRepository.findAll();
			return ClienteDTO.parse(clientes);
		}else {
			List<Cliente> clientes = clienteRepository.findByCpf(cpf);
			return ClienteDTO.parse(clientes);
		}
	}
	
	@PostMapping
	@Transactional
	public ResponseEntity<ClienteDTO> gravarCliente(@RequestBody @Valid ClienteForm form, UriComponentsBuilder uriBuilder) {
		
		
		Cliente cliente = form.converter(veiculoRepository);
		clienteRepository.save(cliente);

		URI uri = uriBuilder.path("/clientes/{id}").buildAndExpand(cliente.getCpf()).toUri();
		return ResponseEntity.created(uri).body(new ClienteDTO(cliente));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<DetalharClienteDTO> detalharCliente(@PathVariable("id") String cpf) {
		Optional<Cliente> cliente = clienteRepository.findById(cpf);
		if(cliente.isPresent()) {
			return ResponseEntity.ok(new DetalharClienteDTO(cliente.get()));
		}
		
		return ResponseEntity.notFound().build();
	}
	
	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<ClienteDTO> atualizarCliente(@PathVariable("id") String cpf, @RequestBody @Valid AtualizaClienteForm form){
		Optional<Cliente> optional = clienteRepository.findById(cpf);
		if(optional.isPresent()) {
			
			Cliente cliente = form.atualizar(cpf, clienteRepository);
			return ResponseEntity.ok(new ClienteDTO(cliente));
		}
		
		return ResponseEntity.notFound().build();
		
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity<?> DeletearCliente(@PathVariable String cpf){
		Optional<Cliente> optional = clienteRepository.findById(cpf);
		if(optional.isPresent()) {
			clienteRepository.deleteById(cpf);
			return ResponseEntity.ok().build();
		}
		
		return ResponseEntity.notFound().build();
		
		
	}

}