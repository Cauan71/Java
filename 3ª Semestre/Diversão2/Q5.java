import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int [] vetor = new int[3];

    
       for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o "+(i+1)+" ª Número: \n");
            vetor[i] = sc.nextInt();
            
            
        }
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] %2 == 0) {
                System.out.println("O número "+vetor[i]+" é Par");
            
        }else{
            System.out.println("O número "+vetor[i]+" é Ímpar");

        }
    }
    sc.close();
    }
}

