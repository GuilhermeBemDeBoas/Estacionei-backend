package com.mackenzie.estacionei.controller;

import java.net.URI;
import java.util.List;
import java.util.Arrays;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.mackenzie.estacionei.controller.dto.ClienteDTO;
import com.mackenzie.estacionei.entity.Cliente;
import com.mackenzie.estacionei.entity.Veiculo;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class ClienteController {
	@GetMapping("/clientes")
	public List<ClienteDTO> listaCliente(){
		Cliente cliente = new Cliente ("12345678910" , "Caleb", new Veiculo("TOP7777", "BUGATTI", "XIRON"));
		
		return ClienteDTO.parse(Arrays.asList(cliente, cliente));
	}

	@PostMapping("/clientes")
	public ResponseEntity criaCliente(@RequestBody ClienteDTO cliente) {
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand("id do cliente").toUri();

		return ResponseEntity.created(location).build();
	}

	@PutMapping("/clientes/{id}")
	public ResponseEntity atualizaCliente(@RequestBody ClienteDTO cliente, @PathVariable long id) {
		return ResponseEntity.noContent().build();
	}

	@DeleteMapping("/clientes/{id}")
	public ResponseEntity deletaCliente(@PathVariable long id) {
		return ResponseEntity.noContent().build();
	}
}
