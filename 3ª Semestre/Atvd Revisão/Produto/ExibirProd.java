package Produto;

public class ExibirProd{
    public static void main(String[] args) {
        Produto p1 = new Produto("Mouse", 20, 2);
        Produto p2 = new Produto("Cadeira", 60, 2);

        System.out.println("Valor Total P1: "+p1.calcularTotal());
        System.out.println("Valor Total P2: "+p2.calcularTotal());


        // Alterar a quantidade
        p2.setQuantidade(6);
        System.out.println("Depois da alteração: ");
        System.out.println("Valor Total p2: "+p2.calcularTotal());
    }

}