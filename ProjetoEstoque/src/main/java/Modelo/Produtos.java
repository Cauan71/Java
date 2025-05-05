/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author lerinha
 */
public class Produtos {
    private String nome;
    private String fornecedor;
    private Integer quantidade ;
    private double preco;
    private String Responsavel;
    
    public Produtos(){
        
    }

    public Produtos(String nome, String fornecedor, Integer quantidade, double preco, String Responsavel) {
        this.nome = nome;
        this.fornecedor = fornecedor;
        this.quantidade = quantidade;
        this.preco = preco;
        this.Responsavel = Responsavel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getResponsavel() {
        return Responsavel;
    }

    public void setResponsavel(String Responsavel) {
        this.Responsavel = Responsavel;
    }
    
    
    
    
}
