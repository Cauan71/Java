package Solo;

import java.util.Scanner;

// Escreva um programa que solicite ao usuário um número inteiro e exiba se ele é positivo, negativo ou zero .

public class Exercicio1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um Número: ");
        int numero = sc.nextInt();
        
        if (numero > 0 ) {
            System.out.printf("O número " + numero +" é Positivo");
            
        }else if (numero < 0 ){
            System.out.printf("O Número "+numero+ "é Negativo");

        }else{
            System.out.println("O Número "+numero+ " é Nulo");
        }
        sc.close();
        
    }
}