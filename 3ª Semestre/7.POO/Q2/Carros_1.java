package Q2;

import java.util.Scanner;
import java.util.ArrayList;

public class Carros_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Carros> lista = new ArrayList<>();

        int op = 0;
        int contador = 0;

        while (op != 3) {
            System.out.println("\n===== MENU CARROS =====");
            System.out.println("1 - CADASTRAR");
            System.out.println("2 - LISTAR");
            System.out.println("3 - SAIR");
            System.out.println("Escolha uma opção: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Informe a Marca do Carro: ");
                    String marca = sc.next();

                    System.out.println("Informe o Modelo do Carro: ");
                    String modelo = sc.next();

                    System.out.println("Informe o Ano de Fabricação :");
                    Integer ano_fabricacao = sc.nextInt();


                    lista.add(new Carros(marca, modelo, ano_fabricacao));
                    
                    System.out.println("Carro Cadastrado com Sucessfull!! ");

                    break;

                case 2:
                    if (lista.isEmpty()) {
                        System.out.println("A Lista está Vazia");
                        
                    }
                    else{

                        for (Carros car : lista) {

                            System.out.println("\n"+(contador+1)+ "ª Carro");
                            System.out.println("Marca: "+car.getMarca()+ "\nModelo: "+car.getModelo()+ "\nAno Fabricação: "+car.getAno_fabricacao());

                            contador++;                            
                        }
                    }

                    break;

                case 3:
                    System.out.println("\nFinalizando o Sistema ......");
                    break;
            
                default:
                    System.out.println("\nOpção Inválida, Tente Novamente...");
                    break;
            }
            
            
        }
        
    }
}
