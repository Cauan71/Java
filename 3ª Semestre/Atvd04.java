import java.util.Scanner;

public class Atvd04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int escolha = 0;

        System.out.println("Digite um número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite outro número: ");
        int num2 = sc.nextInt();

        while (escolha != 5) {
            System.out.println("\n==== OPERAÇÕES BÁSICAS ====");
            System.out.println("1 - SOMA");
            System.out.println("2 - SUBTRAÇÃO");
            System.out.println("3 - MULTIPLICAÇÃO");
            System.out.println("4 - DIVISÃO");
            System.out.println("5 - SAIR");
            System.out.println("Selecione a Opção desejada: ");
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    int total = num1+ num2;
                    System.out.printf("A Soma de " + num1+ " + "+num2+" é: " + total);
                    
                    break;

                case 2:

                    total = num1 - num2;
                    System.out.println("A Subtração de:  "+num1+" - "+num2+" é = "+ total);
                    
                    break;
            
                case 3:
                    total = num1 * num2;
                    System.out.println("A multiplicação de : "+num1+" * "+num2+" é = "+total);
                    
                    break;

                case 4:
                    total = num1/num2;
                    System.out.println("A Divisão de : "+num1+" / "+num2+" é = "+total);
                    break;

                case 5:
                    System.out.println("==================");
                    System.out.println("Finalizando o Sistema....");
                    break;
                default:
                System.out.println("Opção Inválida!!");
                    break;
            }
            
        }

        sc.close();
    }
}
