package Aula;
import java.util.Scanner;

public class zAtividade06 {
    public static void main(String[] args) {
        // IMC

        Scanner sc = new Scanner(System.in);
            

        System.out.println("Digite seu Peso: ");
        double peso = sc.nextDouble();

        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();

        double imc = peso /(altura * altura);
        
        
        System.out.println("Seu IMC é: "+imc);
        sc.close();
    }
}