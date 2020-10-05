package br.ucsal.matriculas;

public class Aluno {
	
	private String alunoNome;
	private int alunoMatricula;
	
	public Aluno(String nome, int numero) {
		this.alunoNome = nome;
		this.alunoMatricula = numero;
	}	

	public int getAlunoMatricula() {
		return alunoMatricula;
	}

	public void setAlunoMatricula(int alunoMatricula) {
		this.alunoMatricula = alunoMatricula;
	}

	public String getAlunoNome() {
		return alunoNome;
	}

	public void setAlunoNome(String alunoNome) {
		this.alunoNome = alunoNome;
	}

}
