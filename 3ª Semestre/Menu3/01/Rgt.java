import java.util.Scanner;

public class Rgt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar ");
            System.out.println("3 - Alterar");
            System.out.println("4 - Remover");
            System.out.println("5 - Sair ");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                
                case 1:
                    System.out.println("Bem vindo");
                    break;
            
                case 2:
                    System.out.println("sdfasdasd");

                default:
                    break;
            }
        }

        sc.close();
    }
}
