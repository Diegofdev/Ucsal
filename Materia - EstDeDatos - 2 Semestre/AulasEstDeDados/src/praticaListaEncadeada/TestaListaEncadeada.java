package praticaListaEncadeada;

public class TestaListaEncadeada {

	public static void main(String[] args) {
		ListaEncadeada listaEncadeada = new ListaEncadeada();
		

	}
	
	private void adicionarPessoa(ListaEncadeada listaEncadeada) {
		Pessoa p1 = new Pessoa(1, "Danilo Caramelo", "Danilo@gmail.com" , 23);
		Pessoa p2 = new Pessoa(1, "Gabriela", "Gabriela@gmail.com" , 22);
		
		listaEncadeada.adicionar(p1);
		listaEncadeada.adicionar(p2);
	}

}
