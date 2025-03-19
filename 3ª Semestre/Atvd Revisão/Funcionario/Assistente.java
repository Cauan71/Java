package Funcionario;
// HERANÇA
public class Assistente extends Func{

    private double calcularBonus;
    
        public Assistente(String nome, double salario, String cargo,double calcularBonus) {
                super(nome, salario, cargo);
    
                this.calcularBonus = 0.05*salario;
            
            
        }

        public double getCalcularBonus() {
            
            return calcularBonus;
        }

        public void setCalcularBonus(double calcularBonus) {
            this.calcularBonus = calcularBonus;
        }


        public double calcularBonus(){
            return super.getSalario()*5/100;
        }

        

    
    
 
    
        
}
