package Funcionario;
// HERANÇA
public class Gerente extends Func{
    private double bonus;

    public Gerente(String nome, double salario, String cargo, double bonus) {
        super(nome, salario, cargo);
        this.bonus = 0.10*salario;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // public double calcularBonus(){
    //     return super.getSalario()*10/100;
    // }

     
}
