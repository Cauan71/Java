package Veiculo;

public class Exibir {
    public static void main(String[] args) {
        
        System.out.println("\n===== CARRO =====");
        carros car = new carros("Chevrolet", "CLASSIC", 2016, 2);
        
        car.exibirInfo();

        System.out.println("\n===== MOTO =====");
        moto mt = new moto("Honda", "FAN 160", 2022);
        mt.exibirInfo();
    }
    
}
