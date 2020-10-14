package provaQ4ListaPass;



public class ListaPassageiros {

	private ProxPassageiros primeiro;
	private ProxPassageiros ultimo;
	private int contador;
	private int contadorInicio;
	private int contadorFim;

	public ProxPassageiros getPrimeiro() {
		return primeiro;
	}
	public void setPrimeiro(ProxPassageiros primeiro) {
		this.primeiro = primeiro;
	}
	public ProxPassageiros getUltimo() {
		return ultimo;
	}
	public void setUltimo(ProxPassageiros ultimo) {
		this.ultimo = ultimo;
	}
	public int getContador() {
		return contador;
	}
	public void setContador(int contador) {
		this.contador = contador;
	}

	public void estaVazia() {
		if (this.primeiro == null) {
			System.out.println("A lista está vazia.");
		} else {
			System.out.println("A lista possui elementos.");
		}
	}

	public void adicionar(Passageiros pax) {
		ProxPassageiros proxPax = new ProxPassageiros(pax);

		if (contador >= 5) {
			System.exit(0);
		} else {
			if (this.primeiro == null && this.ultimo == null) {
				this.primeiro = proxPax;
				this.ultimo = proxPax;
				contador++;
			} else {
				this.primeiro.setAnterior(proxPax);
				proxPax.setProximo(this.primeiro);
				this.primeiro = proxPax;
				proxPax.setAnterior(null);
				contador++;			
			}
		}
	}

	public void adicionarInicio(Passageiros pax) {
		ProxPassageiros proxPax = new ProxPassageiros(pax);

		if (contadorInicio > 0) {
			System.exit(0);
		}

		if (this.primeiro == null && this.ultimo == null) {
			this.primeiro = proxPax;
			this.ultimo = proxPax;
			contador++;
		} else {
			this.primeiro.setAnterior(proxPax);
			proxPax.setProximo(this.primeiro);
			this.primeiro = proxPax;
			proxPax.setAnterior(null);
			contador++;
			contadorInicio++;
		}		
	}

	public void adicionarFim(Passageiros pax) {
		ProxPassageiros proxPax = new ProxPassageiros(pax);	

		if (contadorFim > 0) {
			System.exit(0);
		}

		if (this.primeiro == null && this.ultimo == null) {
			this.primeiro = proxPax;
			this.ultimo = proxPax;
			contador++;
		} else {
			this.ultimo.setProximo(proxPax);
			proxPax.setAnterior(this.ultimo);
			this.ultimo = proxPax;
			contador++;
			contadorFim++;
		}
	}

	public void listaPassageiros() {
		System.out.println("");
		if (contador == 0) {
			System.out.println("A lista está vazia.");
		} else {
			ProxPassageiros atual = this.primeiro;			
			while (atual != null) {
				System.out.println(atual.getPax().getPaxNome() + "  ");
				atual = atual.getProximo();
			}
		}
		
		System.out.println("\n----------------------");
	}

}
