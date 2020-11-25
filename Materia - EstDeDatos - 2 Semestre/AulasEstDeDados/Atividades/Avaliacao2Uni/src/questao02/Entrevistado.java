package questao02;

public class Entrevistado {
	
	private String nome;
	private int idade;
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
	@Override
	public String toString() {
		return "Entrevistado: Nome = " + nome.toUpperCase() + ", idade = " + idade + "";
	}
	public Entrevistado(String nome, int idade) {
		
		this.nome = nome;
		this.idade = idade;
	}
	
	public Entrevistado() {
		
	}
	
	

}
