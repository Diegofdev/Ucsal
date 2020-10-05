package br.ucsal.professoresUcsal;

public class ProxProfessor {
	
	private Professor prof;
	private ProxProfessor proximo;
	
	public ProxProfessor(Professor p) {
		this.prof = p;
		this.proximo = null;
	}

	public Professor getProf() {
		return prof;
	}

	public void setProf(Professor prof) {
		this.prof = prof;
	}

	public ProxProfessor getProximo() {
		return proximo;
	}

	public void setProximo(ProxProfessor proximo) {
		this.proximo = proximo;
	}	

}
