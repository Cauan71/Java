package AulaArquivos;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Atvd1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            FileWriter atividade = new FileWriter("atvd.txt", true);


            System.out.println("Digite uma frase: ");
            String frase = sc.next();

            atividade.write("Frase: "+ frase);
            atividade.close();
            
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo ");
            e.printStackTrace();
            
        }finally{
            sc.close();
        }
    }
    
}
