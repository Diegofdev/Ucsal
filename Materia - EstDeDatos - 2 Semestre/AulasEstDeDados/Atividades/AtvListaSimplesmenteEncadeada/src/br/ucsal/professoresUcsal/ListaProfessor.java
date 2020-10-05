package br.ucsal.professoresUcsal;

public class ListaProfessor {
	
	private ProxProfessor primeiro;
	private ProxProfessor ultimo;
	private int quantidadeNo;
	
	public ListaProfessor() {
		this.primeiro = null;
		this.ultimo = null;
		this.quantidadeNo = 0;
		
	}

	public ProxProfessor getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(ProxProfessor primeiro) {
		this.primeiro = primeiro;
	}

	public ProxProfessor getUltimo() {
		return ultimo;
	}

	public void setUltimo(ProxProfessor ultimo) {
		this.ultimo = ultimo;
	}

	public int getQuantidadeNo() {
		return quantidadeNo;
	}

	public void setQuantidadeNo(int quantidadeNo) {
		this.quantidadeNo = quantidadeNo;
	}
	
	public void inserirPrimeiro(Professor p) {
		ProxProfessor novoNo = new ProxProfessor(p);
		
		if(this.estaVazia()) {
			this.ultimo = novoNo;			
		}
		
		novoNo.setProximo(this.primeiro);
		this.primeiro = novoNo;
		this.quantidadeNo++;
	}
	
	public void inserirUltimo(Professor p) {
		ProxProfessor novoNo = new ProxProfessor(p);
		
		if (this.estaVazia()) {
			this.primeiro = novoNo;
		} else {
			this.ultimo.setProximo(novoNo);
		}

		this.ultimo = novoNo;
		this.quantidadeNo++;
	}
	
	public void removerUltimo() {
		if (this.primeiro.getProximo() != null) {
			ProxProfessor novoNo = buscaPenultimoElemento(this.primeiro);
			this.ultimo = novoNo;
			this.quantidadeNo--;
			novoNo.setProximo(null);			
		} else {
			primeiro = ultimo = null;
		}
	}
	
	private ProxProfessor buscaPenultimoElemento(ProxProfessor novoNo) {
		if(novoNo.getProximo().equals(ultimo)) {
			return novoNo;
		}
		return buscaPenultimoElemento(novoNo.getProximo());
	}
	
	public boolean estaVazia() {
		return(this.primeiro == null);
	}
	
	public void listaVazia() {
		if (this.primeiro != null && this.ultimo != null) {
			System.out.println("A lista n�o est� vazia.");
		} else {
			System.out.println("A lista est� vazia.");
		}
	}
	
	public void tamanhoAtual() {
		System.out.println("O n�mero de professores �: " + this.getQuantidadeNo() + ".");
	}
	
	public void excluirTudo() {
		this.setPrimeiro(null);
		this.setUltimo(null);
		this.quantidadeNo = 0;
	}
	
	public void listarProfessores() {
		if (estaVazia()) {
			System.out.println("A lista est� vazia.");
		} else {
			ProxProfessor atual = this.primeiro;			
			while (atual != null) {
				System.out.println(atual.getProf().getNome());
				atual = atual.getProximo();
			}
		}
	}


}
