import java.util.Scanner;

public class fe_Strg5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Definir tamanho dos arrays
        System.out.println("Quantos nomes deseja inserir ?");
        int tamanho = sc.nextInt();
        sc.nextLine(); // Consumir a quebra de Linha

        // Criando a array com o tamanho informado pelo usuário
        String [] nomes = new String[tamanho];

        //Preenchendo o array com os nomes digitados
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome " + (i+1) + ": ");
            nomes[i] = sc.nextLine();

        }

        // Exibindo os nomes armazenados no array
        System.out.println("\nNomes Digitados: ");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        sc.close();
    }
}
