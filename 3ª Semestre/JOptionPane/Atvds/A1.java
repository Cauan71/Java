package Atvds;

import javax.swing.JOptionPane;

public class A1 {
 public static void main(String[] args) {
    String num = JOptionPane.showInputDialog("Informe sua idade: ");

    int idade = Integer.parseInt(num);

    if (idade < 0 ) {
        JOptionPane.showMessageDialog(null,"Informe uma idade válida!! ","Identificação",
        JOptionPane.ERROR_MESSAGE);
        
    } else if(idade >= 18) {
        JOptionPane.showMessageDialog(null,"Você é MAIOR de Idade","Identificação",
        JOptionPane.INFORMATION_MESSAGE);
        
    } else if(idade < 18 && idade >= 0){
        JOptionPane.showMessageDialog(null,"Você é MENOR de Idade", "Identificação",
        JOptionPane.INFORMATION_MESSAGE);
    }
 }   
}
