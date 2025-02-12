import java.util.Scanner;

public class Atvd01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Caixa de Papelão");
            System.out.println("2 - Sacola Plástica");
            System.out.println("3 - Embalagem de Vidro");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Ideal para transporte e armazenamento");
                    break;

                case 2:
                    System.out.println("Leve e Prática, mas pouco Sustentável");
                    break;

                case 3:
                    System.out.println("Resistente e Reutilizável");
                    break;

                case 4:
                    System.out.println("Finalizando o Sistema.....");
                    break;

                default:
                    System.out.println("Digite um Número Válido!!");
                    break;
            }
        }
        sc.close();
    }
}
