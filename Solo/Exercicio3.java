package Solo;

import java.util.Scanner;
// Crie um programa que solicite dois números ao usuário e exiba qual é o maior .

public class Exercicio3 {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite o Primeiro Número: ");
            int num1 = sc.nextInt();

            System.out.println("Digite o Segundo Número: ");
            int num2 = sc.nextInt();

            if (num1 > num2) {
                System.out.println("O Número "+num1+ " é Maior do que o Nº "+ num2);
                
            }else if(num2 > num1){
                System.out.println("O Número "+num2+ " é Maior do que o Nº "+ num1);
            }else{
                System.out.println("Ambos os números são iguais! ");
            }
        }


    }
}
