package br.ucsal.lab.tarefas;

import br.ucsal.lab.tarefas.gui.InterfaceGrafica;

public class Programa {

	
	public static void main(String[] args) {
		
		Lista listaTarefas = new Lista();
		listaTarefas.adicionarTarefa("Estudar OO","Devo estudar OO");
		listaTarefas.adicionarTarefa("Tomar cafe","Tomar cafe",true);
		listaTarefas.adicionarTarefa("Ouvir musica","Ouvir Rock",true);
		
		TarefaPrazo tarefaPrazo = new TarefaPrazo("Viagem", "Para Aracaju", false, "10/10/2020");
		listaTarefas.adicionarTarefa(tarefaPrazo);
		
		TarefaEmail tarefaEmail = new TarefaEmail("Viagem", "Para Aracaju", false, "10/10/2020", "Teste@hotmail.com");
		listaTarefas.adicionarTarefa(tarefaEmail);
		
		for(Tarefa tarefa : listaTarefas.getTarefas()) {
			System.out.println(tarefa);
		}

		new InterfaceGrafica(listaTarefas);

	}
}
