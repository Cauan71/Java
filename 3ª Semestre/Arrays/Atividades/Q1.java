package Atividades;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[3];
        int soma = 0;
        int media = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o "+ (i+1)+ "ª Número: ");
            numeros[i] = sc.nextInt();

            soma += numeros[i];
            media = soma/ 3;
        }


        System.out.println("Média: "+ media);

        

        sc.close();
    }
}
