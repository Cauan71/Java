import java.util.Scanner;

public class Atvd03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        

        System.out.println("Digite a senha : ");
        String senha = sc.next();

        if (!senha.equals("alfa")) {
            System.out.println("Senha Incorreta ");
            
        }else{
            System.out.println("Senha Correta");
        }
        sc.close();
    }
}
