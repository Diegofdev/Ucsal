package provaQ4ListaPass;

public class TestePassageiros {

	public static void main(String[] args) {
		
		ListaPassageiros lista = new ListaPassageiros();		

		Passageiros pax1 = new Passageiros("Karen");
		Passageiros pax2 = new Passageiros("Luana");
		Passageiros pax3 = new Passageiros("Gilberto");
		Passageiros pax4 = new Passageiros("Tony Stark");
		Passageiros pax5 = new Passageiros("Pirilampo");
		Passageiros pax6 = new Passageiros("Alex");
		Passageiros pax7 = new Passageiros("Goku");

		lista.adicionar(pax1);
		lista.adicionar(pax2);
		lista.adicionar(pax3);
		lista.adicionar(pax4);
		lista.adicionar(pax5);
		
		lista.listaPassageiros();	

		lista.adicionarFim(pax6);
		
		lista.listaPassageiros();
		
		lista.adicionarInicio(pax7);
		
		lista.listaPassageiros();
		
	}

}
