package br.com.api.produtos.repositorio;

import org.springframework.stereotype.Repository;

import br.com.api.produtos.modelo.ProdutoModelo;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface ProdutoRepositorio extends CrudRepository <ProdutoModelo, Long >{

    

    
}
