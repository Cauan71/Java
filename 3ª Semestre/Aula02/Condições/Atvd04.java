import java.util.Scanner;

public class Atvd04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número Inteiro: ");
        int numero = sc.nextInt();

        if (numero %2 == 0) {
            System.out.println("O número "+numero+" é Par");
            
        }else{
            System.out.println("O número "+numero+" é Ímpar");
        }

        sc.close();
    }
    
}
