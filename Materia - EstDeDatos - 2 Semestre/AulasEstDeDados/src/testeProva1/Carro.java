package testeProva1;

public class Carro {
	
	private String nome;
	private String fabricante;
	
	public Carro(String nome, String fabricante) {
		
		this.nome = nome;
		this.fabricante = fabricante;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Nome do Carro = " + nome + ", Fabricante = " + fabricante + "";
	}
	
	
	
	

}
