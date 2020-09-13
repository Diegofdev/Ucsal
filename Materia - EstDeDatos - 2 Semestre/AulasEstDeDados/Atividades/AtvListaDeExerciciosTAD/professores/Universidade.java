package professores;

import java.util.ArrayList;
import java.util.List;

import dadosLivros.Livro;

public class Universidade implements Caderneta {
	private String nome;
    private int codigo;
    private List banca;

    Universidade(){
        this.banca = new ArrayList<Livro>(); 
    }

    @Override
    public void colocar(String nome, int codigo) {
        List dados = new ArrayList<>();

        dados.add(nome);
        dados.add(codigo);

        this.banca.add(dados);
    }

    public void mostrar() {
        for (Object i : banca) {
            System.out.println(i);
        }
    }

}
