package br.ucsal.aulas.primeiraAula_usuarios.view;

import br.ucsal.aulas.primeiraAula_usuarios.controller.UsuarioController;
import br.ucsal.aulas.primeiraAula_usuarios.model.Usuario;

import java.util.Scanner;

public class UsuarioConsole {

    private Scanner console = new Scanner(System.in)

    public void BemVindo() {

        System.out.print("Bem vindo ao sistema de consulta de usuarios");
    }

    public void login(UsuarioController controller){
        System.out.println("Login de acesso");
        System.out.println("Usuario");
        String usuario = console.nextLine();
        System.out.println("Senha");
        String senha = console.nextLine();
        Usuario usuario = controller.login(usuario,senha);
    }
}
