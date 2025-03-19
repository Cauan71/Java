package Eletrodoméstico;

public class microondas extends eletro{

    private int tempoMaximo ;

    public microondas(String marca, double potencia, int tempoMaximo) {
        super(marca, potencia);

        this.tempoMaximo = tempoMaximo;

    }

    public int getTempoMaximo() {
        return tempoMaximo;
    }

    public void setTempoMaximo(int tempoMaximo) {
        this.tempoMaximo = tempoMaximo;
    }


    public void ligar(){
        System.out.println("Ligado");
        
    }

    public void exibirInfo(){
        System.out.println("\nMarca: "+getMarca()+"\nPotência: "+getPotencia()+"\nTempo Máximo: "+getTempoMaximo());
        
    }
    
    


    
}
