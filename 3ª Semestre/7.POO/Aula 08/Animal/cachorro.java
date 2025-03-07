package Animal;

public class cachorro extends animal {
    
    private String raca;
    private String som;

    

    public cachorro(String nome, int patas, String raca, String som) {
        super(nome, patas);
        this.raca = raca;
        this.som = som;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSom() {
        return som;
    }
    
    public void setSom(String som) {
        this.som = som;
    }
    
    
   
   
public void exibir(){
    System.out.println("Nome: "+getNome()+"\nPatas: "+getPatas()+"\nRaça: "+getRaca()+"\nSom: "+getSom());

}

    
}
