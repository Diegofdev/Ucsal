package br.ucsal.numeros7;

public class ListaNumeros {
	private ProxNumeros primeiro;
	private ProxNumeros ultimo;
	private int qntdNumeros;

	public void adicionarComeco (int n) {
		ProxNumeros proxNumeros = new ProxNumeros();
		proxNumeros.setValor(n);

		if (this.primeiro == null && this.ultimo == null) {
			this.primeiro = proxNumeros;
			this.ultimo = proxNumeros;
			this.qntdNumeros++;
			cheio();
		} else {
			proxNumeros.setProximo(this.primeiro);
			this.primeiro = proxNumeros;			
			this.qntdNumeros++;
			cheio();
		}
	}

	public void adicionarFinal (int n) {
		ProxNumeros proxNumeros = new ProxNumeros();
		proxNumeros.setValor(n);

		if (this.primeiro == null && this.ultimo == null) {
			this.primeiro = proxNumeros;
			this.ultimo = proxNumeros;
			this.qntdNumeros++;
			cheio();
		} else {
			this.ultimo.setProximo(proxNumeros);
			this.ultimo = proxNumeros;
			this.qntdNumeros++;
			cheio();
		}
	}

	public void cheio() {
		if (this.qntdNumeros >= 7) {
			System.out.println("A lista está cheia!");
			System.exit(0);
		} else {
			System.out.println("Ainda tem " + (7 - this.qntdNumeros) +" espaços na lista.");
		}
	}


}
