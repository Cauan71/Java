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

                    int anoFabricado = Integer.parseInt(ano);

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
                    for (int i = 1; i < lista.size(); i++) {
                        a31 atvd = lista.get(i);
                        
                        String option = JOptionPane.showInputDialog(null,"\nÍndice: "+i+
                                                                    "Informe o carro que deseja detalhar: ");

                       if (lista.get(i).equals(option)) {
                            JOptionPane.showMessageDialog(null,i+"ª Carro: "+lista);
                        
                       }
                        
                        
                    }
                    
                }
                    break;

                case "4":

                    break;
            
                default:
                    JOptionPane.showMessageDialog(null,"Opção Inválida, Tente Novamente","[ERRO]"
                                                ,JOptionPane.ERROR_MESSAGE);
                    break;
            }
            
        }   
    }
    
}
