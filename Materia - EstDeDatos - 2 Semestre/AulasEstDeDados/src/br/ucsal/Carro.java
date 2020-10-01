package br.ucsal;

public class Carro implements InterfaceCarro {
	
	private String nome;
	private String fabricante;
	private int ano;
	private int id;
	
	
	public Carro(String nome, String fabricante, int ano, int id) {
		
		this.nome = nome;
		this.fabricante = fabricante;
		this.ano = ano;
		this.id = id;
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


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public void adicionarCarro(int id, int ano, String fabricante, String carro) {
		
		System.out.println("Carro adicionado");
		
		
	}
	@Override
	public void alterarCarro(String carro) {
		System.out.println("Carro alterado");
		
	}
	@Override
	public void excluirCarro(String carro) {
		System.out.println("Carro excluido");
		
	}
	@Override
	public void checarCarro(String carro) {
		if(carro == nome) {
			System.out.println("Este carro já está na coleção");
		} else {
			System.out.println("Este carro ainda não está na coleção");
		}
		
	}
	
	

}
