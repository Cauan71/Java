package br.com.exemplo.api.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.exemplo.api.Modelo.Pessoa;
import br.com.exemplo.api.repositorio.Repositorio;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class Controle {
    
    
    
    // Localhost:8080
    
    @GetMapping("")
    public String mensagem(){
        return "Olá Mundo";
    }
    
    // localhost:8080/boasVindas
    
    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Seja bem vindo(a)!!";
    }
    
    // localhost:8080/boasVindas/{nome}
    
    @GetMapping("/boasVindas/{nome}")
    public String boasVindas(@PathVariable String nome){
        return "Seja bem vindo(a) " + nome;
    }
    
    @PostMapping("/pessoa")
    public Pessoa pessoa(@RequestBody Pessoa p){
        return p;
    }
    
    // Maven ( Dependências)
    // mysql / data-jpa
    
    
    @Autowired
    private Repositorio acao;

    // Método Cadastrar Pessoa
    @PostMapping("/api")
    public Pessoa cadastrar(@RequestBody Pessoa obj){
        return acao.save(obj);
    }

    // Método Listar
    @GetMapping("/api")
    public List<Pessoa> selecionar(){
        return acao.findAll();
    }


    // Selecionar por codigo
    @GetMapping("/api/{codigo}")
    public Pessoa selecionarPeloCodigo(@PathVariable int codigo){
        return acao.findyByCodigo(codigo);
    }

    // Metodo Editar
   @PutMapping("/api)")
    public Pessoa editar(@RequestBody Pessoa obj){
        return acao.save(obj);
    }
    
    // Metodo Excluir
    // Verifica no thunder as pessoas cadastradas, depois
    // seleciona a pessoa no DELETE e exclui
    @DeleteMapping("/api/{codigo}")
    public void remover(@PathVariable int codigo){
        Pessoa obj = selecionarPeloCodigo(codigo);
        acao.delete(obj);
    }
    
    
    

}
