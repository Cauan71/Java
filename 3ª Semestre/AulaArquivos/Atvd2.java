package AulaArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Atvd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int op = 0;

        try{

        
        FileWriter atvd2 = new FileWriter("atv2.txt", true);
        
        System.out.println("\n===== MENU =====");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Listar");
        System.out.println("3 - Sair");
        op = sc.nextInt();
        
        switch (op) {
            case 1:
                    try {
                        
                        for (int i = 1; i < 2; i++) {
                            System.out.println("Informe o seu nome: ");
                            String nome = sc.next();
                            
                            System.out.println("Informe sua Idade: ");
                            int idade = sc.nextInt();
                            
                            atvd2.close();
                        }
                    } catch (IOException e) {
                        System.out.println("Erro no Arquivo");                        
                        e.printStackTrace();
                    }
                        
                        
                    
                break;

                case 2:
                    try {
                        
                        BufferedReader atividade2 = new BufferedReader(new FileReader("atvd2.txt"));
                        String linha;
                        
                        System.out.println("\n===== Lista Dos Usuários ===== ");
                        while (linha = atividade2.readLine())! null {
                            System.out.println(linha);
                            
                        }
                        
                        atividade2.close();
                        
                    } catch (Exception e) {
                      System.out.println("Erro ao ler o arquivo ");
                      e.printStackTrace();
                    }
                    
                    
                    break;

                case 3:
                    System.out.println("Saindo do Sistema...");
                    break;                   
            
                default:
                    break;
            }
        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo");
            e.printStackTrace();
        }finally{
            sc.close();
        }
    }
}
