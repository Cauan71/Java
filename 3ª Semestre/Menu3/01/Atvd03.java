import java.util.Scanner;

public class Atvd03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n===== MENU MOCHILAS=====");
            System.out.println("1 - Mochila Escolar");
            System.out.println("2 -Mochila de Viagem");
            System.out.println("3 - Mochila Esportiva");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Item Selecionado: [Mochila Escolar]");
                    System.out.println("Compacta e ideal para estudantes");
                    break;
                
                case 2 :
                    System.out.println("Item Selecionado: [Mochila de Viagem]");
                    System.out.println("Espaçosa , ideal para longas jornadas");
                    break;
                case 3:
                    System.out.println("Item Selecionado: [Mochila Esportiva]");
                    System.out.println("Leve, resistente e ergonômica");
                    break;
                case 4:
                    System.out.println("Finalizando o Sistema ......");
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
            
        }
        sc.close();
    }
    
}
