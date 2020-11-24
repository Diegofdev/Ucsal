package filaAlunos;

public class Aluno {
	String nome;
	int idade;
	public Aluno(String nome, int idade) {
		
		this.nome = nome;
		this.idade = idade;
	}
	public Aluno() {
		
	}
	@Override
	public String toString() {
		return "Aluno Nome= " + nome + ", idade= " + idade + "";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
