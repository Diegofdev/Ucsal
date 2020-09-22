package praticaListaEncadeada;

public class ListaEncadeada {
	private Celula primeiro;
	private Celula ultimo;
	private Celula posicaoAtual;
	
	public void adicionar(Pessoa valor) {
		Celula celula = new Celula();
		celula.setValor(valor);
		if (primeiro == null && ultimo == null) {
			primeiro = celula;
			ultimo = celula;
		} else {
			ultimo.setProximo(celula);
			ultimo = celula;
		}
	}
	
	public void remover() {
		if (primeiro.getProximo() != null) {
			Celula celula = buscaPenultimoElemento(primeiro);
			ultimo = celula;
			celula.setProximo(null);
		} else {
			primeiro = ultimo = null;
		}
	}
	
	private Celula buscaPenultimoElemento(Celula celula) {
		if(celula.getProximo().equals(ultimo)) {
			return celula;
		}
		return buscaPenultimoElemento(celula.getProximo());
		
	}
	
	public boolean existeProximo() {
		if(primeiro == null) {
			return false;
		} else if (posicaoAtual == null) {
			posicaoAtual = primeiro;
			return true;
		}else {
			boolean existeProximo = posicaoAtual.getProximo() != null? true : false;
			posicaoAtual = posicaoAtual.getProximo();
			return existeProximo;
		}
	}
	
	

}
