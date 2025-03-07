package Animal;

public class gato extends animal{
    private String som;
    private String cor;
    
    public gato(String nome, int patas, String som, String cor) {
        super(nome, patas);
        this.som = som;
        this.cor = cor;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    
   
    public void exibir(){
        System.out.println("Nome: "+getNome()+"\nPatas: "+getPatas()+"\nCor: "+getCor()+"\nSom: "+getSom());
        
    
    }
    

    
}
