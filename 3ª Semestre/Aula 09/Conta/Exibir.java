package Conta;

import java.util.Scanner;

public class Exibir {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op = 0;

        while (op!= 3) {
            System.out.println("\n===== MENU CONTA =====");
            System.out.println("1 - Cadastrar Conta ");
            System.out.println("2 - Buscar Contas Existentes e Inexistentes");
            System.out.println("3 - Remover Duplicadas ");
            System.out.println("4 - Remover Contas e Tratar Exceções");

            op = sc.nextInt();

            
        }
    }
    
}
