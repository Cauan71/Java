package Solo;

import java.util.Scanner;

// Peça ao usuário para digitar um número inteiro e exiba se ele for par ou ímpar .

public class Exercicio2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite um número: ");
            int numero = sc.nextInt();

            if (numero %2 == 0) {
                System.out.printf("O Número "+numero+ " é Par");
                
            }else{
                System.out.printf("O Número "+numero+" é Ímpar");
            }
        }


    }
}
