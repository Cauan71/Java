import java.util.Scanner;

public class Atvd02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcoes = 0;

        while (opcoes != 4) {
            System.out.println("\n===== MENU CANETAS ===== ");
            System.out.println("1 - Esferográfica");
            System.out.println("2 - Gel");
            System.out.println("3 - Tinteiro");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção: ");
            opcoes = sc.nextInt();
            
            switch (opcoes) {
                case 1:
                    System.out.println("Caneta Esferográfica: Econômica e de Longa Duração");
                    break;
                
                case 2:
                    System.out.println("Caneta Gel: Tinta mais pigmentada e escrita suave");
                    break;

                case 3:
                    System.out.println("Caneta Tinteiro: Clássico e elegante, usada para caligrafia");
                    break;

                case 4 :
                    System.out.println("Finalizando.....");
                    break;

                default:
                    System.out.println("Opção Inválida!!");



            }
        }
        sc.close();
    }
}
