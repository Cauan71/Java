package AulaArquivos;

import java.io.FileWriter;
import java.io.IOException;


public class Arq_1 {
    public static void main(String[] args) {
        
        try{

            // FileWrite escrever no arquivo.txt
            FileWriter escritor = new FileWriter("arquivo.txt");
            
            // Write() adicionar texto no arquivo
            escritor.write("Olá , este é um arquivo teste!\n");

            // close() garantir que os dados sejam salvos
            escritor.close();
            System.out.println("Arquivo criado com Sucesso");

        }catch(IOException e){
            System.out.println("Ocorreu um erro ao criar o arquivo.");
            e.printStackTrace();
        }
    }

}
