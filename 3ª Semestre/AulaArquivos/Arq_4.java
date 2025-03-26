package AulaArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Arq_4 {
    public static void main(String[] args) {
        try {
            BufferedReader leitor = new BufferedReader(new FileReader("escritor.txt"));
            String linha;

            System.out.println("Lista de Produtos: ");
            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
                
            }

            leitor.close();

        } catch (IOException e) {
            System.out.println("Erro ao Ler os Produtos...");
            e.printStackTrace();
        }
    }
}
