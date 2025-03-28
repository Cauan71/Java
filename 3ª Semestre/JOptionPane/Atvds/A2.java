package Atvds;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class A2 {
    public static void main(String[] args) {
        ArrayList <a21> list = new ArrayList<>();

        boolean executando = true;

        while (executando) {
            String opcao = JOptionPane.showInputDialog(
                null,
                "Escolha uma opção:\n1 - Cadastrar\n2 - Listar\n3 - Sair",
                "Menu Principal",
                JOptionPane.QUESTION_MESSAGE
            );

            if (opcao == null) {
                JOptionPane.showMessageDialog(null, "Operação cancelada.");
                break;
            }

            switch (opcao) {
                case "1":
                    JOptionPane.showMessageDialog(null, "Você escolheu Cadastrar.");
                    // Aqui você pode chamar uma função para cadastrar

                    String nome = JOptionPane.showInputDialog(null,"Informe seu nome: ");

                    String number = JOptionPane.showInputDialog(null, "Informe sua idade: ");
                    int idade = Integer.parseInt(number);

                    if (idade > 0 ) {
                        JOptionPane.showMessageDialog(null,"Usuário Cadastrado com Sucesso!!","Cadastro",JOptionPane.INFORMATION_MESSAGE);
                        
                    }else{
                        JOptionPane.showMessageDialog(null,"Informe uma idade válida!! ","[ERRO]" ,JOptionPane.ERROR_MESSAGE);
                    }


                    list.add(new a21(nome, idade));

                    break;
                case "2":

                    if (list.isEmpty()) {
                        JOptionPane.showMessageDialog(null,"A Lista está Vazia , volte para a Opção 1","[ERRO]",JOptionPane.WARNING_MESSAGE);
                        
                    }else{

                        
                        JOptionPane.showMessageDialog(null, "Você escolheu Listar.");
                        // Aqui você pode chamar uma função para listar
                        
                        for (a21 user : list) {
                            
                            JOptionPane.showMessageDialog(null,"=====USUÁRIOS CADASTRADOS===== \nUsuário: "+user.getNome()+
                            "\nIdade: "+ user.getIdade(),"USUÁRIOS CADASTRADOS", JOptionPane.PLAIN_MESSAGE);
                            // System.out.println("\nUsuário: "+user.getNome() + "\nIdade: "+user.getIdade() );
                            
                        }
                    }


                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Saindo do programa...");
                    executando = false;
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.","[ERRO]",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}