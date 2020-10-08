package com.example.demo.controllers;

import com.example.demo.model.entity.Cliente;
import com.example.demo.model.repositories.ClienteRepository;
import com.example.demo.model.services.ClienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api")
@RestController
public class ClienteController {
	private final ClienteService clienteService;

	public ClienteController(ClienteService clienteService) {
		this.clienteService = clienteService;
	}

	@GetMapping("/clientes")
	public List<Cliente> findAll(){
		return clienteService.findAll();
	}
}
