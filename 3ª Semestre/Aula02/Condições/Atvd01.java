import java.util.Scanner;

public class Atvd01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do seu salário: ");
        double salario = sc.nextDouble();

        if (salario >= 3000) {
            System.out.println("Rico");
            
        }else{
            System.out.println("Pobre");
        }

        sc.close();
    }
}
