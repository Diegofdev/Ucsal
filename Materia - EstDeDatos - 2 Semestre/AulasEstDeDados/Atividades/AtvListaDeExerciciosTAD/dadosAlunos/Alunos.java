package dadosAlunos;

import java.util.ArrayList;
import java.util.List;

import dadosLivros.Livro;

public class Alunos implements AlunosInt {
	
	private String nome, semestre;
    private List banco_de_dados;

    Alunos(){
        this.banco_de_dados = new ArrayList<Livro>(); 
    }

    @Override
    public void adicionar(String nome, String semestre) {
        List dados = new ArrayList<>();

        dados.add(nome);
        dados.add(semestre);

        this.banco_de_dados.add(dados);
    }

    public void Estante() {
        for (Object i : banco_de_dados) {
            System.out.println(i);
        }
    }

}
