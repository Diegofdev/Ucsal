package praticaListaEncadeada;

public class Pessoa {
	private Integer id;
	private String nome;
	private String email;
	private int idade;
	
	
	
	public Pessoa(Integer id, String nome, String email, int idade) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.idade = idade;
	}
	
	
	public Pessoa() {
		
	}


	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", email=" + email + ", idade=" + idade + "]";
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

}
