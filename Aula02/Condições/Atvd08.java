import java.util.Scanner;

public class Atvd08 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        
        // && - E 
        // || - OU
        // ! - NÃO

        if (idade > 0) {
            
            if (idade == 0 || idade<=12) {
                System.out.println("Você é Criança");            
            }
            else if (idade == 13 || idade <=17) {
                System.out.println("Você é Adolescente");
                
            }
            else if(idade == 18 || idade <=59){
                System.out.println("Você é Adulto");
            }
            else {
                System.out.println("Você é Idoso");
                
            }
        
            
        
        }else{
            System.out.println("Digite um número válido!!");
        }

        sc.close();
    }
}
