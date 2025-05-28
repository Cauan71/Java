package br.com.exemplo.api.Controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.exemplo.api.Modelo.Pessoa;
import br.com.exemplo.api.Repositorio.Repositorio;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class controle {
    
    @GetMapping("")
    public String mensagem(){
        return "Olá Mundo";

    }
    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Seja Bem - Vindo(a)!!";
    }

    @GetMapping("/boasVindas/{nome}")
    public String boasVindas(@PathVariable String nome){
        return "Seja Bem - Vindo(a) " + nome + "!!!!";
    }


    // Vincular o Modelo Pessoa 
    @PostMapping("/Pessoa")
    public Pessoa Pessoa (@RequestBody Pessoa p) {
        return p;
    }

    
    
    @Autowired
    private Repositorio acao;
    @PostMapping("/api")
    public Pessoa cadastrar(@RequestBody Pessoa obj){
        return acao.save(obj);
    }

    @GetMapping("/api")
    public List <Pessoa> selecionar(){
        return acao.findAll();
    }
    

}
