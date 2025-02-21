import java.util.Scanner;
import java.util.ArrayList;

public class Atvd2 {

    public static void main(String[] args) {
        ArrayList <Integer> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        boolean bonus = false;
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o "+(i+1)+"ª Número: ");
            int numero = sc.nextInt();

            lista.add(numero);
            if (numero == 10  || numero == 100 || numero == 1000) {
                contador += 1;
                bonus = !false;
                
            }
            
            
        }
    
    if (bonus) {
        System.out.println("Parabéns , Você foi contemplado com o valor de R$ 50 por digita os números corretos : "+contador+" vezes");
        
    }
    sc.close();
}
}