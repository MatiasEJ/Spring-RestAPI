package com.example.demo.model.services;

import com.example.demo.model.repositories.ClienteRepository;
import com.example.demo.model.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService{
	private final ClienteRepository clienteRepository;

	public ClienteServiceImpl(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}


	@Override
	@Transactional
	public List<Cliente> findAll() {
		return (List<Cliente>)clienteRepository.findAll();
	}

}
