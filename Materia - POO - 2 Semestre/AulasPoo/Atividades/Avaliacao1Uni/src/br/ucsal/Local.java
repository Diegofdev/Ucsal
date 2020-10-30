package br.ucsal;

import java.util.ArrayList;


public class Local {
	
	private String nome;
	
	private ArrayList<Evento> eventos = new ArrayList<Evento>();

	public Local(String nome) {
		
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(ArrayList<Evento> eventos) {
		this.eventos = eventos;
	}
	
	public void adicionarEvento(Evento evento) {
		this.eventos.add(evento);
	}

	public void listarEventos(){
        for (Evento eventos: this.eventos) {
            System.out.println("Evento " + eventos.getNome());
            System.out.println("Numero de Convidados presentes " + eventos.listarConvidados());
        }
	}

	@Override
	public String toString() {
		return "Local [eventos=" + eventos + "]";
	}

	
	

}
