import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // Criando 2 ArrayList
        ArrayList <String> lista = new ArrayList<>();
        ArrayList <String> telefones = new ArrayList<>();
        int opcao = 0;

        while (opcao !=4) {
            // Menu de Opções
            System.out.println("====== MENU =====");
            System.out.println("1 - Cadastro");
            System.out.println("2 - Listar");
            System.out.println("3 - Excluir");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();
    
            switch (opcao) {
                case 1:
                    // Cadastro
                    System.out.println("Digite seu nome: ");
                    String nome = sc.next();

                    System.out.println("Digite seu número: ");
                    String numero = sc.next();


                    lista.add(nome);
                    telefones.add(numero);

                    System.out.println("Contato Cadastrado com Sucesso!! ");


                    break;

                case 2:
                    
                    if (lista.isEmpty()) {
                        System.out.println("Nenhum Contato cadastrado! ");
                    }
                    else{
                        System.out.println("Contatos Cadastrados: ");
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println("Nome: "+ lista.get(i) + " | Número: "+telefones.get(i));
                            
                        }
                    }
                    break;

                case 3:
                    System.out.println("Digite o nome que deseja excluir: ");
                    String nome_excluido = sc.next();

                    // Verificando se existe o nome na lista
                    int index = lista.indexOf(nome_excluido);
                    if (index != -1) {
                        lista.remove(index);
                        telefones.remove(index);  // Removendo o telefone correspondente
                        System.out.println("Contato excluído com sucesso!");
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    



                    System.out.println("Após a remoção : "+lista);
                    
                    break;
            

                case 4:
                    System.out.println("\n\nFinalizando o Sistema........");
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
            
        }

        sc.close();
    }
}