package Controle;

import DAO.UsuarioDAO;

public class ControleLogin {

    
    private UsuarioDAO usuarioDAO;

    // Construtor: Cria o DAO
    public ControleLogin(){

        usuarioDAO = new UsuarioDAO();

    }


    // Método que será chamado pela interface ( view )

    public boolean autenticar(String login, String senha){
        return usuarioDAO.autenticar(login, senha);
    }



}
