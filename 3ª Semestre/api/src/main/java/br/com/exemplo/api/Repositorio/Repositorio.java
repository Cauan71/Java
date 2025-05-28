package br.com.exemplo.api.Repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.exemplo.api.Modelo.Pessoa;

@Repository
public interface Repositorio extends CrudRepository <Pessoa, Integer>{
    
    List<Pessoa> findAll();
}
