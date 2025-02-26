package Q2;

public class Carros {
    private String marca;
    private String modelo;
    private Integer ano_fabricacao;


    public Carros(String marca, String modelo, Integer ano_fabricacao ){
        this.marca = marca;
        this.modelo = modelo;
        this.ano_fabricacao = ano_fabricacao;
        
    }
    
    // Acessor

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getAno_fabricacao() {
        return ano_fabricacao;
    }

    // Modificador

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno_fabricacao(Integer ano_fabricacao) {
        this.ano_fabricacao = ano_fabricacao;
    }


    
}
