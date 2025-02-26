package Q1;


import java.util.ArrayList;
import java.util.Scanner;

public class Roupa_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList <Roupa> list = new ArrayList<>();
        int op = 0;

        while (op != 3) {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - CADASTRAR");
            System.out.println("2 - LISTAR");
            System.out.println("3 - SAIR");
            System.out.println("Escolha uma opção: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Informe a Cor da Roupa: ");
                    String cor = sc.next();

                    System.out.println("Informe o tamanho: ");
                    String tamanho = sc.next();

                    System.out.println("Informe o tipo: ");
                    String tipo = sc.next();

                    list.add(new Roupa(cor, tamanho, tipo));

                    System.out.println("Roupa Cadastrada com Sucesso!");


                    
                    break;
            
                case 2:
                    if (list.isEmpty()) {
                        System.out.println("Lista vazia");

                        
                    }else{
                        for (Roupa r : list) {
                            System.out.println("===========================");
                            System.out.println("\nCor: "+r.getCor()+ "\nTamanho: "+r.getTamanho()+ "\nTipo: "+r.getTipo()+"\n");

                            
                        }
                    }
                    break;

                case 3:
                    System.out.println("\nFinalizando o Sistema.....");

                    break;
                    



                default:
                    System.out.println("\nOpção Inválida, tente Novamente.....");
                    break;
            }


            
        }


    }
    
}
