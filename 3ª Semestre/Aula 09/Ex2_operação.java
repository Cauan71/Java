import java.util.Scanner;

public class Ex2_operação {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        
        
        try {
            System.out.println("Digite um número: "); 
            int num1 = sc.nextInt();

            System.out.println("Digite o segundo número: ");
            int num2 = sc.nextInt();

            int resultado = num1/num2;
            
            System.out.println("\nResultado: "+resultado);

        } catch (ArithmeticException e) {
            
            System.out.println("Operação Indivisível por Zero");
            
        }finally{
            System.out.println("Finalizandoo....");
        }

        sc.close();
    }
}
