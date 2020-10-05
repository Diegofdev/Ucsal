package br.ucsal.matriculas;

import java.util.ArrayList;
import java.util.Collections;

public class ListaAluno {
	
	private ProxAluno primeiro;
	private ProxAluno ultimo;
	private int quantidade;

	public ListaAluno() {
		this.primeiro = null;
		this.ultimo = null;
		this.quantidade = 0;
	}

	public ProxAluno getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(ProxAluno primeiro) {
		this.primeiro = primeiro;
	}

	public ProxAluno getUltimo() {
		return ultimo;
	}

	public void setUltimo(ProxAluno ultimo) {
		this.ultimo = ultimo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public boolean estaVazia() {
		return(this.primeiro == null);
	}

	public void adicionar(Aluno aln) {
		ProxAluno novoNo = new ProxAluno(aln);

		if(this.estaVazia()) {
			this.ultimo = novoNo;			
		}

		novoNo.setProximo(this.primeiro);
		this.primeiro = novoNo;
		this.quantidade++;
	}

	public void remover() {
		if (this.primeiro.getProximo() != null) {
			ProxAluno novoNo = buscaPenultimoElemento(this.primeiro);
			this.ultimo = novoNo;
			this.quantidade--;
			novoNo.setProximo(null);			
		} else {
			primeiro = ultimo = null;
		}
	}

	private ProxAluno buscaPenultimoElemento(ProxAluno novoNo) {
		if(novoNo.getProximo().equals(ultimo)) {
			return novoNo;
		}
		return buscaPenultimoElemento(novoNo.getProximo()); 
	}

	

	public void imprimirLista() {
		if (estaVazia()) {
			System.out.println("A lista está vazia.");
		} else {
			ProxAluno atual = this.primeiro;			
			while (atual != null) {
				System.out.println(atual.getAluno().getAlunoNome());
				atual = atual.getProximo();
			}
		}
	}
	
	public void pesquisar(String nome) {
		ProxAluno atual = this.primeiro;
		String nomeAluno = "";
		if (estaVazia()) {
			System.out.println("A lista está vazia.");
		} else {
						
			while (atual != null) {
				if(atual.getAluno().getAlunoNome() == nome) {
					System.out.println("Aluno encontrado");
					System.out.println(atual.getAluno().getAlunoNome() + " " + atual.getAluno().getAlunoMatricula());
					nomeAluno = "Encontrado";
					
				} 
				atual = atual.getProximo();
				
			}
			if(nomeAluno == "Encontrado") {
				
			} else {
				System.out.println("Não encontramos este aluno na lista");
			}
		}
	}
	
	public void ordenar() {
		ProxAluno atual = this.primeiro;
		
		ArrayList<String> nomes = new ArrayList<String>();
		
			for (int i = 0; i < this.getQuantidade(); i++) {
				nomes.add(atual.getAluno().getAlunoNome());
				atual = atual.getProximo();
			}
			Collections.sort(nomes);
			
			System.out.println("Lista em ordem alfabética: ");
			for (int i = 0; i < nomes.size(); i++) {
				System.out.println(nomes.get(i));
			}
			System.out.println("\n ");
			
		
		
		
	}
	
	

}
