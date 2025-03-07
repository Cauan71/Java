package Animal;

public class animal {
    private String nome;
    private int patas;
    

    public animal(String nome, int patas) {
        this.nome = nome;
        this.patas = patas;
       
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
    
}
