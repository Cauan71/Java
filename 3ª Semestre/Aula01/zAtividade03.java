import java.util.Scanner;

public class zAtividade03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double numero1 = sc.nextDouble();
        
        System.out.println("Digite o primeiro número: ");
        double numero2 = sc.nextDouble();
        
        System.out.println("Digite o primeiro número: ");
        double numero3 = sc.nextDouble();

        double media3 = (numero1+numero2+numero3)/3;

        System.out.println("----- Resultado -----");
        System.out.println("Média dos 3 Números Digitados: "+media3);

        sc.close();
    }
}
