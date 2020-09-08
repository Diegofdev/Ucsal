package br.ucsal.lab.tarefas;

public class Programa {

	public static void main(String[] args) {
			
		
		Lista listaTarefas = new Lista();
		listaTarefas.adicionarTarefa("Estudar OO", "Devo estudar OO");
		listaTarefas.adicionarTarefa("Tomar café", "Tomar Café", true);
		listaTarefas.adicionarTarefa("Ouvir musica", "Ouvir Rock", true);
		new InterfaceGrafica(listaTarefas);
		
		//for (Tarefa tarefa : listaTarefas.getTarefas()) {
		//	System.out.println(tarefa);
		//}
		

	}

}
