package Aula;
import java.util.Locale;

public class Numeros {
    public static void main(String[] args) {
        
        double a = 6;
        double b = 2;
        double soma = a+b;
        double subtracao = a-b;
        double divisao = a/b;
        double multi = a*b;

        double x = 10.35784;


        System.out.println("--------- RESULTADO -------------");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Multiplicação: " + multi);
        

        System.out.println(x);                                                                  
        // Printf - para concatenar 
        System.out.printf("%.2f%n",x);
        System.out.printf("%.4f%n",x);

        // Modo de Código dos EUA utilizando o " . " para as decimais
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n",x);


    }
}
