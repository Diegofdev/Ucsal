package br.ucsal;

public class Ponto {
	
	private int x;
	private int y;
	
	//construtor
	Ponto(int x1){
		x = x1;
	}
	
	public int getX() {
		return x;
	}




	public void setX(int x) {
		this.x = x;
	}




	public int getY() {
		return y;
	}




	public void setY(int y) {
		this.y = y;
	}




	
	
	
	
	
	void moverPonto(int novoX, int novoY){
		x= novoX;
		y = novoY;
	}

}
