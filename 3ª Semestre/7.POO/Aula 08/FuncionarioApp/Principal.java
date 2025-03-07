package FuncionarioApp;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Funcionario func = new Funcionario("Iuri Cauan", 1500, 21);
        Gerente gert = new Gerente("Cesar", 7000, 60, 250);

        System.out.println("===== FUNCIONÁRIO =====");
        System.out.println("Nome: "+func.getNome()+ "| Salário: "+func.getSalario()+" | Idade: "+func.getIdade());

        System.out.println("\n===== GERENTE =====");
        System.out.println("Nome do Gerente: "+gert.getNome()+" | Salário: "+gert.getSalario()+" | Idade: "+gert.getIdade()+" | Bônus: "+gert.getBonus());


    }
}
