package DAO;

import java.util.ArrayList;
import Modelo.Usuario;


// Tipos Comuns de Pacotes 

public class UsuarioDAO {

    private ArrayList <Usuario> usuarios = new ArrayList<>();

    // Construtor : adiciona usuários "pré cadastrados"

    public UsuarioDAO(){
        usuarios.add(new Modelo.Usuario("admin", "admin123"));
        usuarios.add(new Modelo.Usuario("usuario", "1234"));


    }

    // Verifica se o login e senha informados existem na lista
    public boolean autenticar(String login, String senha){
        for (Usuario u : usuarios) {
            if(u.getLogin().equals(login) && u.getSenha().equals(senha)){
                return true; // Usuario encontrado
            }
            
        }

        return false; // usuario não encontrado
    }

}
