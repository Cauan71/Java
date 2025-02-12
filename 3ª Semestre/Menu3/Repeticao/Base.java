package Repeticao;

import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nNúmeros Ímpares: ");

        for(int i= 1; i<=100 ; i++){
            if (i % 2!= 0) {
                System.out.println("Contagem " + i);
                
            }
        }
        sc.close();
    }

    
}