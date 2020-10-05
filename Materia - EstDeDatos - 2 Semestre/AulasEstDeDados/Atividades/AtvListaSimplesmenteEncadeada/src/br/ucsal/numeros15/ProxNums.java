package br.ucsal.numeros15;

public class ProxNums {
	private ProxNums proximo;
	private int valor;
	
	public ProxNums getProximo() {
		return proximo;
	}
	
	public void setProximo (ProxNums proximo) {
		this.proximo = proximo;
	}
	
	public int getValor() {
		return valor;
	}
	
	public void setValor (int n) {
		this.valor = n;
	}
}
