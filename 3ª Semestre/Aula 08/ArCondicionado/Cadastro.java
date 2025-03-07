package ArCondicionado;

public class Cadastro {
    private String modelo;
    private int codigo;
    private String marca;
    private double btu;
    private String defeito;

    public Cadastro(String modelo, int codigo, String marca, double btu, String defeito) {
        this.modelo = modelo;
        this.codigo = codigo;
        this.marca = marca;
        this.btu = btu;
        this.defeito = defeito;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getBtu() {
        return btu;
    }

    public void setBtu(double btu) {
        this.btu = btu;
    }

    
    public String getDefeito() {
        return defeito;
    }
    
    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }
    
    
    

public void exibir(){
    System.out.println("Modelo: "+getModelo()+"\nCódigo: "+getCodigo()+"\nMarca: "+getMarca()+"\nBTU: "+getBtu()+"\nDefeito: "+getDefeito());
}

    
}