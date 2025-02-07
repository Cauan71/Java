 import java.util.Scanner;
 
 public class cond{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite um número: ");
    int numero = sc.nextInt();

    if (numero > 0) {
     System.out.println("Número Positivo");
    }
    else{
        System.out.println("Número Negativo");
    }
     
    sc.close();
}
}