import java.util.Scanner;

public class Atvd07{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ProfCorreto = "Anderson";


        System.out.println(" Digite o nome do professor: ");
        String Professor = sc.nextLine();
        
    
        while (!Professor.equals(ProfCorreto)) {
            System.out.println("Nome do Professor(a) Errado!!");
            System.out.println("Digite o nome do Profesor: ");
            Professor = sc.nextLine();
            
        }
        System.out.println("Nome Correto!!");
        sc.close();
    }
}