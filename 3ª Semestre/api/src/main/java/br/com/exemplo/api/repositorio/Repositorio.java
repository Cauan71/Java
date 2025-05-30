package br.com.exemplo.api.repositorio;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import br.com.exemplo.api.Modelo.Pessoa;

@Repository
public interface Repositorio extends CrudRepository <Pessoa, Integer> {
    

    List<Pessoa> findAll();

    Pessoa findyByCodigo(int codigo);
    
}
