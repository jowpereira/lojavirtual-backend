package br.com.loja.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.loja.entities.Categoria;
import br.com.loja.repositories.CategoriaRepository;
import br.com.loja.services.CategoriaService;
import br.com.loja.services.exception.ObjectNotFoundException;

@Service
public class CategoriaServiceImpl implements CategoriaService{
	
	@Autowired
	public CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}

}
