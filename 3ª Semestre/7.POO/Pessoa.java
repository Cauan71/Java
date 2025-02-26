
public class Pessoa {
    private String nome;
    private String telefone;

    // Construtor

    public Pessoa(String nome, String Telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    //  Acessor
    public String getNome() {
        return nome;
    }
    
    public String getTelefone() {
        return telefone;
    }
    // Modificador
    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
}