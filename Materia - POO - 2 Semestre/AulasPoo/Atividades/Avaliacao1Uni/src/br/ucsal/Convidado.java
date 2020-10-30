package br.ucsal;

public class Convidado {
	
	private String nome;
	private boolean confirmado;
	private boolean presente;
	
	public Convidado(String nome, boolean confirmado, boolean presente) {
		
		this.nome = nome;
		this.confirmado = confirmado;
		this.presente = presente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean getConfirmado() {
		return confirmado;
	}

	public void setConfirmado(boolean confirmado) {
		this.confirmado = confirmado;
	}

	public boolean getPresente() {
		return presente;
	}

	public void setPresente(boolean presente) {
		this.presente = presente;
	}
	
	
	

}
