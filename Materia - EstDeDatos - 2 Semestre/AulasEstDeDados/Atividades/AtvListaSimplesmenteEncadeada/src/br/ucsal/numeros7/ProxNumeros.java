package br.ucsal.numeros7;

public class ProxNumeros {
	private ProxNumeros proximo;
	private int valor;
	
	public ProxNumeros getProximo() {
		return proximo;
	}
	public void setProximo(ProxNumeros proximo) {
		this.proximo = proximo;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int n) {
		this.valor = n;
	}	

}
