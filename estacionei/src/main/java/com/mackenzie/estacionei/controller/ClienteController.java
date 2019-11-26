package com.mackenzie.estacionei.controller;

import java.util.List;
import java.util.Arrays;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mackenzie.estacionei.controller.dto.ClienteDTO;
import com.mackenzie.estacionei.entity.Cliente;
import com.mackenzie.estacionei.entity.Veiculo;

@RestController @RequestMapping("/clientes")
public class ClienteController {
	
	
	public List<ClienteDTO> listaCliente(){
		Cliente cliente = new Cliente ("12345678910" , "Caleb", new Veiculo("TOP7777", "BUGATTI", "XIRON"));
		
		return ClienteDTO.parse(Arrays.asList(cliente, cliente));
	}

}
