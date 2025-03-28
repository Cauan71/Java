import javax.swing.JOptionPane;

public class Confirm {
 public static void main(String[] args) {
    int resposta = JOptionPane.showConfirmDialog(null, "Deseja Continuar?? ", "Confirmação",
                    JOptionPane.YES_NO_CANCEL_OPTION);

    if (resposta == JOptionPane.YES_OPTION) {
        JOptionPane.showMessageDialog(null, "Você Escolheu SIM!! ", "Resultado",
                                        JOptionPane.INFORMATION_MESSAGE);

        
    }else{
        JOptionPane.showMessageDialog(null, "Você Escolheu NÃO", "Resultado",
                                        JOptionPane.WARNING_MESSAGE);

    }

 }   
}
