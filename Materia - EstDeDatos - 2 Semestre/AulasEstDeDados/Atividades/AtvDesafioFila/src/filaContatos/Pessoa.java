package filaContatos;

public class Pessoa {

	String nome;
	int idade;
	int telefone;
	public Pessoa(String nome, int idade, int telefone) {
		
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
	}
	
	public Pessoa() {
		
	}
	@Override
	public String toString() {
		return "Contato: nome= " + nome + ", idade= " + idade + ", telefone= " + telefone + "";
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
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
	
	
}
