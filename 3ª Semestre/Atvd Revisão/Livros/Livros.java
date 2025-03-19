package Livros;

public class Livros {
    private String titulo;
    private String autor;
    private int ano_publicacao;
    private double preco;


    public Livros(String titulo, String autor, int ano_publicacao, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano_publicacao = ano_publicacao;
        this.preco = preco;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public int getAno_publicacao() {
        return ano_publicacao;
    }


    public void setAno_publicacao(int ano_publicacao) {
        this.ano_publicacao = ano_publicacao;
    }


    public double getPreco() {
        return preco;
    }


    public void setPreco(double preco) {
        this.preco = preco;
    }

    
    public void exibir_info(){
        System.out.println("\n===== LIVRO =====");
        System.out.println("\nTítulo: "+getTitulo());
        System.out.println("\nAutor: "+getAutor());
        System.out.println("\nAno: "+getAno_publicacao());
        System.out.println("\nPreço: "+getPreco());
        
    }

    
}
