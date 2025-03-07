package Veiculo;

public class carros extends veiculos{
    private int qtdPortas;

    public carros(String marca, String modelo, int ano, int qtdPortas) {
        super(marca, modelo, ano);
        this.qtdPortas = qtdPortas;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    @Override
public void exibirInfo(){
    System.out.println("Marca: "+getMarca()+" | Modelo: "+getModelo()+" | Ano: "+getAno()+"| Quantidade de Portas: "+getQtdPortas());
    
}
}
