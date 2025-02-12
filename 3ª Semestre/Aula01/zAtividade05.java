import java.util.Scanner;

public class zAtividade05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // Força Aplicada
        System.out.print("Digite a Força Aplicada: ");
        double f = sc.nextDouble();

        // Distância
        System.out.print("Digite a Distância: ");
        double d = sc.nextDouble();

        double trabalhoR = f*d;

        System.out.println("O Resultado é : "+ trabalhoR);

        sc.close();
        
    }
}
