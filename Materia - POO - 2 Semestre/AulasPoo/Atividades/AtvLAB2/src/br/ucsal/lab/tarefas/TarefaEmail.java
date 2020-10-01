package br.ucsal.lab.tarefas;



public class TarefaEmail extends TarefaPrazo {
	private String email;

	
	public TarefaEmail(String titulo, String descricao, Boolean concluido, String data, String email) {
		super(titulo, descricao, concluido, data);
		this.email = email;
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	//@Override
	//public String getConcluida() {
	//	return email;
	//}
	
	
	@Override
	public String toString() {
		return "Tarefa [titulo=" + getTitulo() + ", descricao=" + getDescricao() + 
				", concluida=" + getConcluida() + "]" + "TarefaPrazo [data=" + getData() + "]" + "Email [Email =" + getEmail() + "]";
	}

	

}
