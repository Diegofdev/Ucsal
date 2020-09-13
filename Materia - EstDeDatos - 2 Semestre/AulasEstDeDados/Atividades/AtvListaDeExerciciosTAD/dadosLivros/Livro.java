package dadosLivros;

import java.util.List;
import java.util.ArrayList;

public class Livro implements Armazenar {

	private String titulo, editora;
    private int ano_de_publicacao;
    private List armazem;

    Livro(){
        this.armazem = new ArrayList<Livro>(); 
    }

    @Override
    public void adicionar(String titulo, String editora, int ano) {
        List dados = new ArrayList<>();

        dados.add(titulo);
        dados.add(editora);
        dados.add(ano);

        this.armazem.add(dados);
    }

    public void Estante() {
        for (Object i : armazem) {
            System.out.println(i);
        }
    }
	
	

}
