import java.util.Scanner;

public class Atvd07 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um Número: ");
        int numero = sc.nextInt();

        if (numero == 0) {
            System.out.println("O número "+numero+" é Nulo");
            
        }else if (numero > 0 ) {
            System.out.println("O Número "+numero+" é Positivo");
            
        }else{
            System.out.println("O Número "+numero+" é Negativo");
        }
        
        sc.close();
    }
}
