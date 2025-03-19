package Eletrodoméstico;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("===== GELADEIRA =====");
        geladeira gel = new geladeira("Brastemp", 1200, 40);

        gel.exibirInfo();
        gel.ligar();

        System.out.println("===== MICROONDAS =====");
        microondas micro = new microondas("Temp", 500, 10);
        micro.exibirInfo();
        micro.ligar();


    }
}
