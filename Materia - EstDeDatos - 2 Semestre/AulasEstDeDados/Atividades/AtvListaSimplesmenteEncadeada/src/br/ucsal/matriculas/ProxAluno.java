package br.ucsal.matriculas;

public class ProxAluno {
	
	private Aluno aln;
	private ProxAluno proximo;
	
	public ProxAluno(Aluno a) {
		this.aln = a;
		this.proximo = null;
	}
	
	public Aluno getAluno() {
		return aln;
	}
	public void setAluno(Aluno aln) {
		this.aln = aln;
	}
	public ProxAluno getProximo() {
		return proximo;
	}
	public void setProximo(ProxAluno proximo) {
		this.proximo = proximo;
	}	

}
