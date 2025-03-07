package ArCondicionado;

import java.util.Scanner;
import java.util.ArrayList;

public class Condicionado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Cadastro> list = new ArrayList<>();

        int op = 0;
        int contador = 0;

        while (op!=3) {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar Aparelhos");
            System.out.println("2 - Gerar Relatório");
            System.out.println("3 - Fechar Sistema");
            System.out.println("Escolha uma opção: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Informe o Modelo do Ar: ");
                    String modelo =sc.next();

                    System.out.println("Informe o Código: ");
                    int codigo = sc.nextInt();

                    System.out.println("Informe a Marca: ");
                    String marca = sc.next();

                    System.out.println("Informe o BTU do AR: ");
                    double btu = sc.nextDouble();

                    System.out.println("\nHá Defeito? Se sim , Informe-o:");
                    String defeito = sc.next();

                    list.add(new Cadastro(modelo, codigo, marca, btu, defeito));

                    System.out.println("Cadastro Realizado com Sucesso!!! ");
                    break;
                    
                    case 2:
                        if (list.isEmpty()) {
                            System.out.println("A Lista está Vazia");
                            
                        }else{
                            for (Cadastro arc : list) {
                                System.out.println("\n===== "+(contador+1)+"ª RESULTADO =====");
                                System.out.println("Modelo: "+arc.getModelo()+"\nCódigo: "+arc.getCodigo()+"\nMarca: "+arc.getMarca()+"\nBTU: "+arc.getBtu()+"\nDefeito: "+arc.getDefeito());

                                contador++;
                        }
                                
                            }
                            
                            break;
                        
                    case 3:
                        System.out.println("Finalizando o Sistema.....");
                        break;
                        
                    default:
                    System.out.println("Opção Inválidada, Tente Novamente...");
                    break;
                        }
            }
            
        }

    }
    

