import java.util.Scanner;
import java.util.ArrayList;

public class Array_List2 {
    public static void main(String[] args) {
        
        // Criando um Scanner para entrada de dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Criando um ArrayList para armazenar as Strings 
        ArrayList <String> lista = new ArrayList<>();

        //  Solicitando ao usuário que insira uma String

        System.out.println("Insira uma string: ");
        String entrada = scanner.nextLine();

        // Adicionando a string a lista
        lista.add(entrada);

        // Exibindo a lista
        System.out.println("Elementos da Lista: ");
        for (String elemento: lista){
            System.out.println(elemento);
        }


        scanner.close();
    }
}
