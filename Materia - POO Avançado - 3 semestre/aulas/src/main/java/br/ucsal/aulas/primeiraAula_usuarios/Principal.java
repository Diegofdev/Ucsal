package br.ucsal.aulas.primeiraAula_usuarios;


import br.ucsal.aulas.primeiraAula_usuarios.model.Usuario;

/**
 * Cadastro de usuarios para um sistema. um usuario vai possuir um nome, email, perfil e senha
 * A senha deve ser criptografada
 * Os perfis devem ser USUARIO e ADMINISTRADOR
 * o sistema deve possuir autenticação que deve ser feita pelo email e senha
 * Apenas o admin pode ver a lista de usuarios
 *
 * Um usuario do sistema com perfil de ADMIN acessa o sistema passando email. depois ele acessa pede a lista de usuarios cadastrados.
 *
 * Tarefas
 * - criar a funcionalidade de autenticação.
 * - criar a funcionalidade de listar usuario.
 *
 * Cadastro de usuarios
 *
 */

public class Principal {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("pedro@email.com","Pedro", "1234","ADMINISTRADOR");

        usuario1.salvar();

        Usuario usuario2 = new Usuario("maria@email.com","Maria","1234");

        usuario2.salvar();
    }

}
