package br.ucsal.aulas.primeiraAula_usuarios.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    //Map<String, Usuario> usuarios = new HashMap<String, Usuario>();

    private static List<Usuario> usuarios = new ArrayList<Usuario>();

    private String nome;
    private String email; //index
    private String perfil;
    private String senha;

    public Usuario(String nome, String email, String perfil, String senha) {
        this.nome = nome;
        this.email = email;
        this.perfil = perfil;
        this.senha = senha; //SENHA DEVE SER CRIPTOGRAFADA
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public static void adicionaUsuario (Usuario usuario) {
        usuarios.add(usuario);

    }

}
