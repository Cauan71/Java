package Atividades;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] numeros = new int[5];
        int maiorNumero = 0;
        int menorNumero = 9999;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o "+(i+1)+"ª número: ");
            numeros[i] = sc.nextInt();

            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
                
            }

            if (numeros[i] < menorNumero) {
                menorNumero = numeros[i];
                
            }


        }

        System.out.println("Números Digitados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("Maior Número: "+ maiorNumero);
        System.out.println("Menor Número: "+ menorNumero);


        sc.close();
    }
}
