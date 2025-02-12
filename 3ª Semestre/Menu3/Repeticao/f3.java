package Repeticao;

import java.util.Scanner;

public class f3 {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para gerar a tabuada: ");
        int numero = sc.nextInt();




        for (int i = 1; i <=10  ; i++) {
            
            System.out.println("===== TABUADA =====");
            System.out.println(numero + " x "+ i+ " = "+numero*i);
        }
        
        
        sc.close();
    }
        
}
