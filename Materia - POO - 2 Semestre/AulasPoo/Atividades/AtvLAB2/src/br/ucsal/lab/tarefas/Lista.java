package br.ucsal.lab.tarefas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lista {

	
	private List<Tarefa> tarefas = new ArrayList<>();

	/**
	 * Retornando a lista de tarefas imutavel
	 * @return tarefas
	 */
	public List<Tarefa> getTarefas() {
		return Collections.unmodifiableList(tarefas);
	}

	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}
	 
	public void adicionarTarefa(Tarefa tarefa) {
		this.tarefas.add(tarefa);
	}
	
	public void adicionarTarefa(String titulo,String descricao) {
		this.adicionarTarefa(titulo,descricao,false);
	}
	
	public void adicionarTarefa(String titulo,String descricao, Boolean concluida) {
		Tarefa tarefa = new Tarefa(titulo, descricao,concluida);
		this.adicionarTarefa(tarefa);
	}
	
	public void adicionarTarefa(String titulo,String descricao, Boolean concluida, String data) {
		TarefaPrazo tarefa = new TarefaPrazo(titulo, descricao, concluida, data);
		this.adicionarTarefa(tarefa);
	}
	
}
