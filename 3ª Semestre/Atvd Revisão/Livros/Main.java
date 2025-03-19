package Livros;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        ArrayList <Livros> lista = new ArrayList<>();

        
        int op = 0;

        while (op!=5) {
            System.out.println("\n===== CADASTRO DE LIVROS =====");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Listar");
            System.out.println("3- Alterar as Informações de um Livro Existente");
            System.out.println("4 - Remover um Livro");
            System.out.println("5 - Fechar o Sistema");

            switch (op) {
                case 1:
                System.out.println("Informe o Título do Livro: ");
                String titulo = sc.next();

                System.out.println("Informe o Autor: ");
                String autor = sc.next();

                System.out.println("Informe o Ano de Publicação: ");
                int ano_publicacao = sc.nextInt();

                System.out.println("Informe o Preço: ");
                double preco = sc.nextDouble();
                
                    
                    break;

                case 2:
                    if (lista.isEmpty()) {
                        System.out.println("A Lista está vazia");
                        
                    }else{
                        for (Livros book : lista) {
                            book.exibir_info();

                            
                        }
                    }
            
                default:
                    break;
            }
            
        }
        
    }
    
}
