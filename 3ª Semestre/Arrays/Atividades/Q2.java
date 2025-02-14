package Atividades;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] numeros = new int[3];
        int maiorNumero = 0;
        

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = sc.nextInt();

            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
                
            }    
            
        }
        System.out.println("Números Digitados: "); 
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println("Maior Número: "+ maiorNumero);
        
            
    

        sc.close();
    }
}
