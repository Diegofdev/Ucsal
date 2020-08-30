package atvOO;

/* Crie uma casa e pinte-a, crie três portas e coloque-as na casa;
 * abre e feche as mesmas como desejar. utilize o método quantasPortasEstaoAbertas para imprimir o numero de portas abertas
 */

public class Casa {
	
	String cor;
	boolean porta1;
	boolean porta2;
	boolean porta3;
	
	void pinta(String s) {
		cor = s;
	}
	int quantasPortasEstaoAbertas() {
		int portas = 0;
		if(porta1 == true) {
			portas++;
		} 
		if (porta2 == true ) {
			portas++;
		}
		if (porta3 == true ) {
			portas++;
		}
		return portas;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Casa c1 = new Casa();
		c1.cor = "Cinza";
		c1.porta1 = false;
		c1.porta2 = false;
		c1.porta3 = false;
		
		System.out.println("A Cor da casa é "+ c1.cor + " e a casa tem "+ c1.quantasPortasEstaoAbertas()+ " portas abertas" );
		
		c1.cor = "Vermelha";
		c1.porta1 = false;
		c1.porta2 = true;
		c1.porta3 = true;
		
		System.out.println("A Cor da casa é "+ c1.cor + " e a casa tem "+ c1.quantasPortasEstaoAbertas()+ " portas abertas" );

	}

}
