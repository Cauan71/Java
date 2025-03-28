package Atvds;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class A3 {
    public static void main(String[] args) {
    ArrayList<a31> lista = new ArrayList<>();

        while (true) {
            
            String opcao = JOptionPane.showInputDialog(null,
            "Escolha uma opção:\n1 - Cadastrar\n2 - Listar\n3 - Detalhar \n4 - Sair",
            "Menu Principal",
            JOptionPane.QUESTION_MESSAGE
            );


            switch (opcao) {
                case "1":
                    String marca = JOptionPane.showInputDialog(null,"Informe a Marca: ",
                                                                "CADASTRO",JOptionPane.INFORMATION_MESSAGE);

                                    
                    String modelo = JOptionPane.showInputDialog(null, "Informe o Modelo: ",
                                                                "CADASTRO",JOptionPane.INFORMATION_MESSAGE);

                    
                    String ano = JOptionPane.showInputDialog(null,"Informe o Ano de Fabricação: "
                                                            ,"CADASTRO",JOptionPane.INFORMATION_MESSAGE);

                    

                    lista.add(new a31(marca, modelo, 0, 0));

                    JOptionPane.showMessageDialog(null,"Carro Cadastrado com Sucesso!! ");

                    break;

                case "2":

                for (a31 car : lista) {
                    
                    JOptionPane.showMessageDialog(null,"===== CARRO CADASTRADO ====="+
                                                "\nMarca: "+ car.getMarca()+
                                                "\nModelo: "+car.getModelo() + 
                                                "\nAno Fabricado: "+car.getAnoFabricado());

                    
                }

                    break;


                case "3":
                if (lista.isEmpty()) {
                    JOptionPane.showMessageDialog(null,"Não Há carros cadastrados");
                    
                }else{    

                        
                        String carroProcurado = JOptionPane.showInputDialog(null,"Informe o carro que deseja detalhar: ");

                        int indice = lista.indexOf(carroProcurado);

                        if (indice != -1) {
                            JOptionPane.showMessageDialog(null,"O Carro"+carroProcurado+ "está na Posição: "+indice);
                            
                        }else{
                            JOptionPane.showMessageDialog(null,"O Carro "+carroProcurado+ " não foi encontrado");
                        }

                        
                    }
                    
                
                    break;

                case "4":
                    JOptionPane.showMessageDialog(null, "Saindo Do Sistema.....");

                    break;
            
                default:
                    JOptionPane.showMessageDialog(null,"Opção Inválida, Tente Novamente","[ERRO]"
                                                ,JOptionPane.ERROR_MESSAGE);
                    break;
            }
            
        }   
    }
    
}
