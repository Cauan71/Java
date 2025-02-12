package Repeticao;

import java.util.Scanner;

public class f1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n==================");
        System.out.println("Números Ímpares de 1 a 51: ");
        for (int i = 1; i <= 51; i++) {
            if (i % 2 != 0 ) {
                System.out.println(i);
                
            }
            
        }
        System.out.println("\n==================");
        System.out.println("Números Pares de 52 a 100: ");
        for (int i = 52; i <= 100 ; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                
            }
            
        }
        sc.close();


    }
    
}
