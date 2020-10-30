package br.ucsal;

public class Principal {

	public static void main(String[] args) {
		
		Local local = new Local("Ucsal");
		Evento evento = new Evento("Palestra", "10/10/2020", 20.50);
		Evento evento2 = new Evento("Palestra2", "111/10/2020", 30.50);
		
		local.adicionarEvento(evento);
		local.adicionarEvento(evento2);
		
		Convidado convidado1 = new Convidado("Diego", true, false);
		Convidado convidado2 = new Convidado("Antonio", true, true);
		Convidado convidado3 = new Convidado("Beto", true, true);
		Convidado convidado4 = new Convidado("Juca", true, false);
		Convidado convidado5 = new Convidado("Jão", true, true);
		
		
		evento.adicionarConvidado(convidado1);
		evento2.adicionarConvidado(convidado2);
		evento2.adicionarConvidado(convidado3);
		evento2.adicionarConvidado(convidado4);
		evento.adicionarConvidado(convidado5);
		
		local.listarEventos();

	}

}
