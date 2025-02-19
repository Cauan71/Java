import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define o tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = sc.nextInt();
        int[] vetores = new int[tamanho];
        int contador = 0;

        // Preenche o vetor com os números
        for (int i = 0; i < vetores.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            vetores[i] = sc.nextInt();
        }

        // Pergunta qual número o usuário deseja verificar a frequência
        System.out.print("Digite qual número gostaria de ver quantas vezes foi repetido: ");
        int escolha = sc.nextInt();

        // Conta quantas vezes o número aparece no vetor
        for (int i = 0; i < vetores.length; i++) {
            if (vetores[i] == escolha) {
                contador++;
            }
        }

        // Exibe o resultado
        System.out.println("O número " + escolha + " aparece " + contador + " vez(es) no vetor.");

        // Fecha o scanner
        sc.close();
    }
}
