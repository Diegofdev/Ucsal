package testeProva1;

public class Programa {

	public static void main(String[] args) {
		
		ListaCarros lista = new ListaCarros();
		
		lista.inserirCarro("onix", "GM");
		lista.inserirCarro("argo", "Fiat");
		lista.inserirCarro("gol", "VW");
		lista.inserirCarro("etios", "toyota");
		
		lista.listarFila();
		
		lista.listarPilha();

	}

}
