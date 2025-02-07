import java.util.Scanner;

public class Atvd02 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua Nota Final: ");
        double nota = sc.nextDouble();

        if (nota >= 7 ) {
            System.out.println("Você está Aprovado(a)!! ");
            
        }else{
            System.out.println("Você está Reprovado(a)!!");
        }

        sc.close();

    }
}
