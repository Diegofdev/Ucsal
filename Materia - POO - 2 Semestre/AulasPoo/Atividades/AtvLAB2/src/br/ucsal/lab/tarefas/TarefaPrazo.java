package br.ucsal.lab.tarefas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TarefaPrazo extends Tarefa {
	
	private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDate data;

	public TarefaPrazo(String titulo, String descricao, Boolean concluido, LocalDate data) {
		super(titulo, descricao, concluido);
		this.data = data;
	}
	
	public TarefaPrazo( String titulo, String descricao, Boolean concluido, String data) {
		this(titulo,descricao, concluido,LocalDate.parse(data, formatter));
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Tarefa [titulo=" + getTitulo() + ", descricao=" + getDescricao() + 
				", concluida=" + getConcluida() + "]" + "TarefaPrazo [data=" + getData() + "]";
	}
	
	//@Override
	//public String getConcluida() {
	//	String formatedDate;
	//	formatedDate = this.data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	//	return formatedDate;
	//}

}
