package Veiculo;

public class moto extends veiculos {
    private int cilindrada;

    public moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    
    
}
