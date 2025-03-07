package FuncionarioApp;
public class Funcionario{
    private String nome;
    private double salario;
    private Integer idade;

    public Funcionario(String nome, double salario, Integer idade){
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;

    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setSalario(double salario) {
        this.salario = salario;
    }


    public void setIdade(Integer idade) {
        this.idade = idade;
    }
 
    
}