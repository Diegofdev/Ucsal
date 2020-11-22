package br.ucsal.lab.tarefas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
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
	public void exportar(String arquivo) throws IOException {
		Path path = Paths.get(arquivo);
		StringBuilder dados = new StringBuilder();
		
		for(Linha tarefa : tarefas) {
			dados.append(tarefa.coluna1());
			dados.append(";");
			dados.append(tarefa.coluna2());
			dados.append(";");
			dados.append(tarefa.coluna3());
			dados.append(";\r\n");
		}
		Files.write(path, dados.toString().getBytes(), StandardOpenOption.CREATE);
	}
	public void importar(String arquivo) throws IOException {
		Path path = Paths.get(arquivo);
		tarefas.clear();
		List<String> linhasArquivo = Files.readAllLines(path);
		for (String linha : linhasArquivo) {
			String[] campos = linha.split(";");
			Tarefa tarefa = new Tarefa (campos[0], campos[1]);
			tarefas.add(tarefa);
		}
	}
	
}
