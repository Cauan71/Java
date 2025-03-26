public class Aviao {
    private int numero;
    private int capacidadeTotal;
    private int assentosDisponiveis;
    
    public Aviao(int numero, int capacidadeTotal ,int assentosDisponiveis) {
        this.numero = numero;
        this.capacidadeTotal = capacidadeTotal;
        this.assentosDisponiveis = assentosDisponiveis;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public int getAssentosDisponiveis() {
        return assentosDisponiveis;
    }
    
    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }
    
    public boolean reservarAssento() {
        if (assentosDisponiveis > 0) {
            assentosDisponiveis--;
            return true;
        }
        return false;
    }
}
