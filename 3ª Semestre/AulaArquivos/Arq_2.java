package AulaArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Arq_2 {
    public static void main(String[] args) {
        try{
            // FileReader para ler o arquivo
            FileReader leitor = new FileReader("arquivo.txt");

            // BufferedReader para melhorar a leitura
            BufferedReader bufferedReader = new BufferedReader(leitor);
            String linha;


            // While lê por linha até encontrar null (fim do arquivo)
            while ((linha = bufferedReader.readLine()) != null ) {
                System.out.println(linha);

                
            }
            bufferedReader.close();


        } catch (IOException e){
            System.out.println("Erro  ao ler o arquivo.");
            e.printStackTrace();
        }
    }
}
