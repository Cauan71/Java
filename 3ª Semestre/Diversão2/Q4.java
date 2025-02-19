import java.util.Scanner;

public class Q4 {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Variáveis
        
        int tamanho = 2;
        int [] numeros = new int[tamanho];
        int contador = 0;
        int opcao = 0;
        // Menu

        while (opcao != 4) {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Inserir um número: ");
            System.out.println("2 - Exibir Número ");
            System.out.println("3- Alterar Números ");
            System.out.println("4 - Fechar o Programa ");
            
            System.out.println("\nEscolha a opção que deseja: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    for (int i = 0; i < numeros.length; i++) {
                        System.out.println("Digite um número: ");
                        numeros[i] = sc.nextInt();
                        contador += 1;

                        if (contador == tamanho) {
                            System.out.println("Quantidade Lotada");
                            
                        }
                    }
                    
                    break;

                case 2:
                    System.out.println("\nNúmeros Digitados: ");

                    for (int i = 0; i < numeros.length; i++) {
                        System.out.println((i+1)+" ª Número na Posição "+ i+ ": "+ numeros[i]); 
                    }
                    break;

                case 3:
                    System.out.println("\nDigite a posição para modificar o vetor: ");
                    int posicao = sc.nextInt();

                    for (int i = 0; i < numeros.length; i++) {
                        if (posicao == i) {
                            System.out.println("Digite o novo valor: ");
                            numeros[i] = sc.nextInt();
                            
                        }
                    }
                    break;

                case 4:
                    break;
            
                default:
                    System.out.println("Opção Inválida");
                    break;
            }

            
        }
        
        

        sc.close();
    }
}