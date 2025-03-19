package Funcionario;
// HERANÇA
public class Exibir {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Carlos", 10000, "Gerente", 10);
        Assistente ass = new Assistente("Luciana", 2000, "Assistente",5);


        System.out.println("\nValor: "+ass.calcularBonus());


        System.out.println("\n===== GERENTE =====");
        System.out.println("\nNome: "+gerente.getNome()+ "\nSalário: "+gerente.getSalario()+
                            "\nCargo: "+gerente.getCargo()+"\nBônus: "+gerente.getBonus());

        System.out.println("\n===== ASSISTENTE =====");
        System.out.println("\nNome: "+ ass.getNome()+"\nSalário: "+ass.getSalario()+
                            "\nCargo: "+ass.getCargo()+"\nBônus: "+ass.getCalcularBonus());

    }
}
