package Animal;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("\n===== CACHORRO =====");
        cachorro dog = new cachorro("Tuê", 4, "Pitbull", "LATE");
        dog.exibir();

        System.out.println("\n===== GATO =====");
        gato cat = new gato("Neymar", 4, "MIA", "Amarelo");
        cat.exibir();
    }
    
}
