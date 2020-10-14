package provaQ1Aniversario;

public class Convidado implements InterfaceConvidado {
	
	private String nome;
	private String email;
	private int whatsapp;
	private int quantidade = 0;
	
	public Convidado(String nome, String email, int whatsapp) {
		
		this.nome = nome;
		this.email = email;
		this.whatsapp = whatsapp;
		
	}
	
	
	@Override
	public void adicionarConvidado(String nome, String email, int whatsapp) {
		System.out.println("Convidado adicionado");
		quantidade++;
		
	}
	@Override
	public void alterarConvidado(String convidado) {
		System.out.println("Convidado alterado");
		
	}
	@Override
	public void excluirConvidado(String convidado) {
		System.out.println("Convidado removido");
		quantidade--;
		
	}
	@Override
	public void checarConvidado(String convidado) {
		if(getNome() == convidado) {
			System.out.println("Este convidado ja está cadastrado");
		} else {
			System.out.println("Este convidado não está cadastrado");
		}
		
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


	public int getWhatsapp() {
		return whatsapp;
	}


	public void setWhatsapp(int whatsapp) {
		this.whatsapp = whatsapp;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
