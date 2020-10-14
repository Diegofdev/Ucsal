package provaQ3ListaShow;

public class MainShow {

	public static void main(String[] args) {
		ListaShows lista = new ListaShows();
		Show s1 = new Show("Linkin park");
		Show s2 = new Show("Legião urbana");
		Show s3 = new Show("Estakazero");
		Show s4 = new Show("Chiclete com banana");	
		Show s5 = new Show("Aerosmith");	
		
		lista.inserirPrimeiro(s1);
		lista.inserirPrimeiro(s2);
		lista.inserirPrimeiro(s3);
		lista.inserirPrimeiro(s4);	
		lista.inserirPrimeiro(s5);
		
		lista.listarShows();
		lista.tamanhoAtual();
		
		lista.removerUltimo();
		lista.listarShows();
		lista.tamanhoAtual();		

		lista.listaVazia();
		lista.excluirTudo();
		lista.tamanhoAtual();
		lista.listaVazia();

	}

}
