import java.util.Scanner;
import java.util.ArrayList;

public class Banco{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList <ContaBanco> Contas = new ArrayList<>();
        

        int opcao = 0;

        System.out.println("\nInforme o nome do titular da Conta");
        String nome = sc.next();

        System.out.println("Informe a Senha : ");
        int senha = sc.nextInt();

        ContaBanco conta = new ContaBanco(nome, senha);
        
        Contas.add(new ContaBanco(nome, senha));
        System.out.println("Conta Criada com Sucesso!!");


        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Depósito");
            System.out.println("2 - Saque");
            System.out.println("3 - Verificar Saldo ");
            System.out.println("4 - Sair do Sistema");
            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();


            switch (opcao) {
                case 1 :
                    System.out.println("Informe o valor para Depósito :");
                    float deposito = sc.nextFloat();

                    conta.depositar(deposito);
                    
                    break;

                case 2:

                    System.out.println("Informe o valor do saque: ");
                    float valor = sc.nextFloat();

                    conta.Saque(valor); 
                    break;


                case 3:
                    conta.exibirSaldo();

                    break;


                case 4:
                    System.out.println("\n===============");
                    System.out.println("Finalizando o Sistema.......");

                    break;
            
                default:
                    System.out.println("\nOpção Inválida , Tente Novamente......");
                    break;
            }
            
        }while (opcao != 4);

        sc.close();        
    

}
}