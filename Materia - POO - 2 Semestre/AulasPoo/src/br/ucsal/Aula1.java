package br.ucsal;

public class Aula1 {

	public static void main(String[] args) {
		
		Ponto p1 = new Ponto(40);
		//p1.y = 100;
		//p1.x = 72;
		//p1.moverPonto(180, 70);
		
		System.out.println("A Posição do ponto é " + "X " + p1.getX() + " e Y " + p1.getY());
		
		//p1.y = 110;
		//p1.x = 85;
		p1.moverPonto(150, 85);
		
		System.out.println("A nova posição do ponto é " + "X " + p1.getX() + " e Y " + p1.getY());
		

	}

}
