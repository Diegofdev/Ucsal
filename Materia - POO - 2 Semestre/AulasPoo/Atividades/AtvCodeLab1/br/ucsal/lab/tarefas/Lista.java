package br.ucsal.lab.tarefas;

import java.util.ArrayList;

public class Lista {
	
	private ArrayList<Tarefa> tarefas = new ArrayList<Tarefa>();

	public ArrayList<Tarefa> getTarefas() {
		return tarefas;
	}

	public void setTarefas(ArrayList<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}
	
	public void adicionarTarefa(Tarefa tarefa) {
		this.tarefas.add(tarefa);
	}
	
	public void adicionarTarefa(String titulo, String descricao) {
		this.adicionarTarefa(titulo, descricao, false);
	}
	
	public void adicionarTarefa(String titulo, String descricao, Boolean concluida) {
		Tarefa tarefa = new Tarefa(titulo, descricao, concluida);
		this.adicionarTarefa(tarefa);
	}

}
