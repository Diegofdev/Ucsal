package questao01;

public class Professor {
	
	private String nome;
	private String area;
	public Professor(String nome, String area) {
		
		this.nome = nome;
		this.area = area;
		
	}
	
	public Professor() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Professor: Nome: " + nome.toUpperCase() + ", area: " + area.toUpperCase() + "]";
	}
	
	
	
	

}
