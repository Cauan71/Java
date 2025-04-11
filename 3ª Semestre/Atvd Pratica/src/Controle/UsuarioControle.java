package Controle;

import DAO.UsuarioDAO;
import Modelo.Usuario;

import java.util.List;

public class UsuarioControle {
    private UsuarioDAO usuarioDAO = new UsuarioDAO();

    public void cadastrarUsuario(String nome, int idade) {
        Usuario usuario = new Usuario(nome, idade);
        usuarioDAO.salvar(usuario);
    }

    public List<Usuario> obterUsuarios() {
        return usuarioDAO.listarTodos();
    }
}
