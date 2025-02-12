import java.util.Scanner;

public class Atvd05 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Você é MAIOR DE IDADE");
            
        }else{
            System.out.println("Você é MENOR DE IDADE");
        }

        sc.close();
    }
    
}
