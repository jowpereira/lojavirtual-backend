package br.com.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.loja.entities.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
