package View;

import Modelo.Usuario;

import javax.swing.*;

import Controle.UsuarioControle;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.List;

public class UsuarioView extends JFrame {
    private JTextField nomeField;
    private JTextField idadeField;
    private JTextArea resultadoArea;
    private UsuarioControle controle;

    public UsuarioView() {
        controle = new UsuarioControle();

        setTitle("Cadastro de Usuário");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Painel de entrada
        JPanel inputPanel = new JPanel(new GridLayout(3, 2));
        inputPanel.add(new JLabel("Nome:"));
        nomeField = new JTextField();
        inputPanel.add(nomeField);

        inputPanel.add(new JLabel("Idade:"));
        idadeField = new JTextField();
        inputPanel.add(idadeField);

        JButton cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.addActionListener(this::cadastrarUsuario);
        inputPanel.add(cadastrarButton);

        JButton listarButton = new JButton("Listar Usuários");
        listarButton.addActionListener(this::listarUsuarios);
        inputPanel.add(listarButton);

        add(inputPanel, BorderLayout.NORTH);

        // Área de resultado
        resultadoArea = new JTextArea();
        resultadoArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultadoArea);
        add(scrollPane, BorderLayout.CENTER);
    }

    private void cadastrarUsuario(ActionEvent e) {
        String nome = nomeField.getText();
        int idade;

        try {
            idade = Integer.parseInt(idadeField.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Idade inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        controle.cadastrarUsuario(nome, idade);
        JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso!");
        nomeField.setText("");
        idadeField.setText("");
    }

    private void listarUsuarios(ActionEvent e) {
        List<Usuario> usuarios = controle.obterUsuarios();
        resultadoArea.setText(""); // limpar

        for (Usuario u : usuarios) {
            resultadoArea.append("Nome: " + u.getNome() + ", Idade: " + u.getIdade() + "\n");
        }
    }
}
