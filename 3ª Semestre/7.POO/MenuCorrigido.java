import java.util.ArrayList;
import java.util.Scanner;

public class MenuCorrigido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Pessoa> list = new ArrayList<>();
        int op = 0;

        while (op != 4) {
            System.out.println("\n ===== MENU =====");
            System.out.println("1 - CADASTRAR");
            System.out.println("2 - LISTAR");
            System.out.println("3 - REMOVER");
            System.out.println("4 - SAIR");
            System.out.println("Escolha uma opção: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Informe o nome: ");                    
                    String nome = sc.next();

                    System.out.println("Informe o telefone: ");
                    String telefone = sc.next();

                    list.add(new Pessoa(nome, telefone));

                    System.out.println("Contato Cadastrado com Sucesso!! ");

                    break;

                case 2:
                    if (list.isEmpty()) {
                        System.out.println("Lista Vazia ");

                    }else{
                        for (Pessoa p : list) {
                            System.out.println("Nome: "+ p.getNome()+ "\n Telefone: " + p.getTelefone());
                            
                        }

                    }

                    break;

                case 3:
                    if (list.isEmpty()) {
                        System.out.println("Lista Vazia");
                        
                    }else{
                        System.out.println("Informe o indice a ser removido: ");
                        int indice = sc.nextInt();

                        if (indice >= 0 && indice<list.size()) {
                            list.remove(indice);
                            System.out.println("Contato Removido com Sucesso ! ");


                            
                        }
                    }

                    break;

                
                case 4:
                    System.out.println("================");
                    System.out.println("\nSaindo.....");
            
                default:
                    System.out.println("\nOpção Inválida , Tente Novamente.... ");
                    break;
            }


            
        }

        sc.close();

    }   
}
