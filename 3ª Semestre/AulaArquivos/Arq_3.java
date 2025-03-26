package AulaArquivos;

import java.io.FileWriter;
import java.util.Scanner;

public class Arq_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            FileWriter escritor = new FileWriter("escritor.txt", true);

            System.out.println("Digite o Nome do Produto: ");
            String nome = sc.next();

            System.out.println("Digite o Preço do Produto: ");
            double preco = sc.nextDouble();
            
            escritor.write(nome + " - R$ " + preco + "\n");
            escritor.close();

            System.out.println("Produto Cadastrado com Sucesso!!!");
            
        } catch (Exception e) {
            System.out.println("Erro ao Ler o Arquivo...");
            e.printStackTrace();
            
        } finally{
            sc.close();
        }


    }
}
