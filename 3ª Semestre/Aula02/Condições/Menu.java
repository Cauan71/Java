import java.util.Scanner;


public class Menu {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        while (opcao<= 4 || opcao !=4) {
            System.out.println("----- Resultado -----");
            System.out.println("1 - Opção 01");
            System.out.println("2 - Opção 02");
            System.out.println("3 - Opção 03");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção: ");

            opcao = sc.nextInt();
            
            
        }

        sc.close();
    }
}
