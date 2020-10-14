package provaQ3ListaShow;

public class ListaShows {
	
	private ProxShow primeiro;
	private ProxShow ultimo;
	private int quantidadeNo;
	
	public ListaShows() {
		this.primeiro = null;
		this.ultimo = null;
		this.quantidadeNo = 0;
		
	}

	public ProxShow getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(ProxShow primeiro) {
		this.primeiro = primeiro;
	}

	public ProxShow getUltimo() {
		return ultimo;
	}

	public void setUltimo(ProxShow ultimo) {
		this.ultimo = ultimo;
	}

	public int getQuantidadeNo() {
		return quantidadeNo;
	}

	public void setQuantidadeNo(int quantidadeNo) {
		this.quantidadeNo = quantidadeNo;
	}
	
	public void inserirPrimeiro(Show p) {
		ProxShow novoNo = new ProxShow(p);
		
		if(this.estaVazia()) {
			this.ultimo = novoNo;			
		}
		
		novoNo.setProximo(this.primeiro);
		this.primeiro = novoNo;
		this.quantidadeNo++;
	}
	
	public void inserirUltimo(Show p) {
		ProxShow novoNo = new ProxShow(p);
		
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
			ProxShow novoNo = buscaPenultimoElemento(this.primeiro);
			this.ultimo = novoNo;
			this.quantidadeNo--;
			novoNo.setProximo(null);			
		} else {
			primeiro = ultimo = null;
		}
	}
	
	private ProxShow buscaPenultimoElemento(ProxShow novoNo) {
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
			System.out.println("A lista não está vazia.");
		} else {
			System.out.println("A lista está vazia.");
		}
	}
	
	public void tamanhoAtual() {
		System.out.println("O número de shows é: " + this.getQuantidadeNo() + ".");
	}
	
	public void excluirTudo() {
		this.setPrimeiro(null);
		this.setUltimo(null);
		this.quantidadeNo = 0;
	}
	
	public void listarShows() {
		if (estaVazia()) {
			System.out.println("A lista está vazia.");
		} else {
			ProxShow atual = this.primeiro;			
			while (atual != null) {
				System.out.println(atual.getShow().getNome());
				atual = atual.getProximo();
			}
		}
	}


}
