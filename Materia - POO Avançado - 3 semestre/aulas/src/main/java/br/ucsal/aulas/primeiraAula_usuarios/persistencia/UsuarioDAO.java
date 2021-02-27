package br.ucsal.aulas.primeiraAula_usuarios.persistencia;

import br.ucsal.aulas.primeiraAula_usuarios.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    private static List<Usuario> usuarios = new ArrayList<Usuario>();

    public void salvar(Usuario usuario) {
        usuarios.add(usuario);

//        for (Usuario usuario : usuarios) {
//            System.out.println(usuario);
//        }

    }

    public List<Usuario> lista(){
        return usuarios;
    }
}
