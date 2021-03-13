package br.ucsal.aulas.primeiraAula_usuarios.controller;

//MVC - CONTROLLER

import br.ucsal.aulas.primeiraAula_usuarios.model.Usuario;
import br.ucsal.aulas.primeiraAula_usuarios.persistencia.UsuarioDAO;
import br.ucsal.aulas.primeiraAula_usuarios.view.UsuarioConsole;

public class UsuarioController {

    private UsuarioConsole view - new UsuarioConsole();
    private UsuarioDAO dao = new UsuarioDAO();

    public UsuarioController(){
        view.BemVindo();
    }

    public Usuario login(Usuario usuario, String senha) {
        dao.lista();

        return null;
    }

}
