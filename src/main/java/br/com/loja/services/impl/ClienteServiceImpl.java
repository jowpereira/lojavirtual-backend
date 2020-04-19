package br.com.loja.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.loja.entities.Cliente;
import br.com.loja.repositories.ClienteRepository;
import br.com.loja.services.ClienteService;
import br.com.loja.services.exception.ObjectNotFoundException;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	public ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}

}
