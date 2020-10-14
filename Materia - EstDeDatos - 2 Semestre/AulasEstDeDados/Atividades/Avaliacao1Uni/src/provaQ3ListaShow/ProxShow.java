package provaQ3ListaShow;

public class ProxShow {
	
	private Show show;
	private ProxShow proximo;
	
	public ProxShow(Show p) {
		this.show = p;
		this.proximo = null;
	}

	public Show getShow() {
		return show;
	}

	public void setShow(Show show) {
		this.show = show;
	}

	public ProxShow getProximo() {
		return proximo;
	}

	public void setProximo(ProxShow proximo) {
		this.proximo = proximo;
	}	

}
