import java.util.Scanner;


public class Ex3_Conversão {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        

        try {

            
            System.out.println("\n===== MENU CONVERSÃO =====");
            System.out.println("Digite um número para a conversão: ");
            int numero = Integer.parseInt(sc.next());
            

            System.out.println("Número Convertido para String : "+ numero);
            
        } catch (NumberFormatException e ) {
            System.out.println("[ERRO]: Entrada Inválida ! Digite um número inteiro válido");   

        }finally{

            System.out.println("\nFinalizando....");
        }
    }
}
