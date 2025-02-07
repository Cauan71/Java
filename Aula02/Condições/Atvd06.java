import java.util.Scanner;

public class Atvd06 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua 1ª Nota: ");
        int nota1 = sc.nextInt();

        System.out.println("Digite sua 2ª Nota: ");
        int nota2 = sc.nextInt();

        int media = (nota1+nota2)/2;

        System.out.println("---- Resultado ----");
        System.out.println("Sua Média é: "+ media);

        if (media >= 7) {
            System.out.println("Você está Aprovado(a)");            
        }else if (media == 6) {
            System.out.println("Você está de Recuperação");
            
        }else{
            System.out.println("Você está Reprovado(a)");
        }

        sc.close();
    }
    
}
