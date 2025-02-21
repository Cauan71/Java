import java.util.ArrayList;


public class Ar_List3 {

    public static void main(String[] args) {
        ArrayList <String> nomes = new ArrayList<>();
        nomes.add("Anderson");
        nomes.add("Bob");
        nomes.add("Carol");

        // Listando todos os objetos da Lista 
        System.out.println("Primeiro Nome: "+nomes);


        // Acessando o elemento pelo Índice
        System.out.println(nomes.get(0));

        // Iteração sobre os elementos 
        for (String nome : nomes) {
            System.out.println(nome);

        }
        
    }

}
