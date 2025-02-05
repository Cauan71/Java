package Aula;
import java.util.Scanner;

public class zAtividade04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String p1 = sc.next();


        System.out.println("Digite outra palavra: ");
        String p2 =  sc.next();

        String Resultado = p1+p2;

        System.out.println("Resultado: "+ Resultado);
        sc.close();
    }
}
