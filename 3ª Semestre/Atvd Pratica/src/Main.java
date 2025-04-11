import View.UsuarioView;

public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            UsuarioView view = new UsuarioView();
            view.setVisible(true);
        });
    }
}
