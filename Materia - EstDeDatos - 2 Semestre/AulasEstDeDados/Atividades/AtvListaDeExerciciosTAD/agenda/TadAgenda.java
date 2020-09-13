package agenda;

public class TadAgenda {

	public static void main(String[] args) {
		Agenda a = new Agenda();
        a.adicionar(12345678);
        a.adicionar(87654321);
        a.adicionar(1579);
        a.excluir(12345678);
        a.atualizar();

	}

}
