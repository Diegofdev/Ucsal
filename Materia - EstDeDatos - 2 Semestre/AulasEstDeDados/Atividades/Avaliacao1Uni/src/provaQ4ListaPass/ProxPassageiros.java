package provaQ4ListaPass;

public class ProxPassageiros {
	
	private Passageiros pax;
	private ProxPassageiros proximo;
	private ProxPassageiros anterior;
	
	public ProxPassageiros (Passageiros p) {
		this.pax = p;
		this.proximo = null;
		this.anterior = null;
	}

	public ProxPassageiros () {
		this.pax = null;
		this.proximo = null;
		this.anterior = null;
	}
	
	public Passageiros getPax() {
		return pax;
	}

	public void setPax(Passageiros pax) {
		this.pax = pax;
	}

	public ProxPassageiros getProximo() {
		return proximo;
	}

	public void setProximo(ProxPassageiros proximo) {
		this.proximo = proximo;
	}

	public ProxPassageiros getAnterior() {
		return anterior;
	}

	public void setAnterior(ProxPassageiros anterior) {
		this.anterior = anterior;
	}	

}
