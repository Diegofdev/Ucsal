package br.ucsal.numeros15;

public class ListaNumeros {
	
	private ProxNums primeiro;
	private ProxNums ultimo;
	
	private int quantNumeros;
	
	public void adicionar (int n) {
		ProxNums nums = new ProxNums();
		nums.setValor(n);

		if (this.primeiro == null && this.ultimo == null) {
			this.primeiro = nums;
			this.ultimo = nums;
			this.quantNumeros++;
			cheio();
		} else {
			nums.setProximo(this.primeiro);
			this.primeiro = nums;			
			this.quantNumeros++;
			cheio();
		}
	}
	
	public void adicionarFinal (int n) {
		ProxNums nums = new ProxNums();
		nums.setValor(n);

		if (this.primeiro == null && this.ultimo == null) {
			this.primeiro = nums;
			this.ultimo = nums;
			this.quantNumeros++;
			cheio();
		} else {
			this.ultimo.setProximo(nums);
			this.ultimo = nums;
			this.quantNumeros++;
			cheio();
		}
	}
	
	public void cheio() {
		if (this.quantNumeros == 15) {
			System.out.println("\nA lista est� cheia!");
		} else if (this.quantNumeros > 15) {
			System.exit(0);
		} else {
			System.out.println("Ainda h� " + (15 - this.quantNumeros) +" espa�os na lista.");
		}
	}	

	public String pesquisar(int n) {
		String mensagem = "";
		int posNum = 0;
		
		ProxNums posAtual = this.primeiro;		
		while ((posAtual != null) && (posAtual.getValor() != n))  {
			posAtual = posAtual.getProximo();
			posNum++;
			
			if (posNum == 15) {
				System.out.println("\nO n�mero [" + n + "] n�o est� contido na lista.");
				System.exit(0);
			}			
		}
		
		System.out.println("\nO n�mero [" + posAtual.getValor() + "] est� na posi��o n�mero " + (posNum + 1) + ".");
		
		return mensagem;
	}

}
