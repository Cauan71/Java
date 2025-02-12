import java.util.Scanner;

public class zAtividade02 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        double media = (num1+num2)/2;

        System.out.println("A média dos Números é: "+media);
        
        sc.close();
    }
}
