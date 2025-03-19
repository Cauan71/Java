package Eletrodoméstico;

public class geladeira extends eletro{

    private double capacidade;

    public geladeira(String marca, double potencia, double capacidade) {
        super(marca, potencia);
        this.capacidade = capacidade;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public void ligar(){
        System.out.println("Ligado");
        
    }
    
    public void exibirInfo(){
        System.out.println("\nMarca: "+getMarca()+"\nCapacidade: "+getCapacidade()+"\nPotência: "+getPotencia());

    }
    


    
}
