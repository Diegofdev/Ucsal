package br.ucsal.lab.tarefas;

public class Tarefa {

	private String titulo;
	private String descricao;
	private boolean concluida;
	
	
	
	public Tarefa(String titulo, String descricao) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
	}
	public Tarefa(String titulo, String descricao, boolean concluida) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.concluida = concluida;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean getConcluida() {
		return concluida;
	}
	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}
	@Override
	public String toString() {
		return "Tarefa [titulo=" + titulo + ", descricao=" + descricao + ", concluida=" + concluida + "]";
	}
	
	
	
	

}
