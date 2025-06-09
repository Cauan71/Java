package br.com.api.produtos.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.produtos.modelo.ProdutoModelo;
import br.com.api.produtos.modelo.RespostaModelo;
import br.com.api.produtos.servico.ProdutoServico;

@RestController
public class ProdutoControle {
 
    @Autowired
    private ProdutoServico ps;


    // Rota Listar Produtos para acessar o servico 
    @GetMapping("/listar")
    public Iterable<ProdutoModelo> listar() {
        return ps.listar();
    }

    @GetMapping("")
    public String rota(){
        return "API Funcionando....";
    }

    // Rota Cadastrar produtos

    @PostMapping("/cadastrar")
    public ResponseEntity<?> cadastrar(@RequestBody ProdutoModelo pm){
        return ps.cadastrar(pm);
    }

    @PostMapping("/alterar")
    public ResponseEntity<?> alterar(@RequestBody ProdutoModelo pm){
        return ps.cadastrarAlterar(pm,"alterar");
    }


    @DeleteMapping("/remover/{codigo}")
    public ResponseEntity<RespostaModelo> remover (long codigo){
        return ps.remover(codigo);
    }





}

