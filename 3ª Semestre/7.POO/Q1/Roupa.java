package Q1;


public class Roupa {
    private String cor ;
    private String tamanho;
    private String tipo;

    public Roupa(String cor, String tamanho , String tipo){
        this.cor = cor;
        this.tamanho = tamanho;
        this.tipo = tipo;

    }
    
    // Acessor
    public String getCor() {
        return cor;
    }
    
    public String getTamanho() {
        return tamanho;
    }
        
    public String getTipo() {
       return tipo;
    }

    // Modificador
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    
        
    }

