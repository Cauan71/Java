package Atvds;

public class a31 {
    private String marca;
    private String modelo;
    private int anoFabricado;
    private int numeroCarro;


    public a31(String marca, String modelo, int anoFabricado, int numeroCarro) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricado = anoFabricado;
        this.numeroCarro = numeroCarro;
    }

    


    public a31(int numeroCarro) {
        this.numeroCarro = numeroCarro;
    }




    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public int getAnoFabricado() {
        return anoFabricado;
    }


    public void setAnoFabricado(int anoFabricado) {
        this.anoFabricado = anoFabricado;
    }




    public int getNumeroCarro() {
        return numeroCarro;
    }




    public void setNumeroCarro(int numeroCarro) {
        this.numeroCarro = numeroCarro;
    }

    

    
}
