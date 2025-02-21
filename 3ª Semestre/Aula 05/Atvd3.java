import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;


public class Atvd3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> nomes = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o "+(i+1)+"ª Nome: ");
            String nome = sc.next();

            nomes.add(nome);

        }

        Collections.sort(nomes);
        

        System.out.println("\nLista após Ordenação: ");
        for (String nome : nomes) {
            System.out.println(nome);
        }
            
        
        sc.close();
    }    
}
