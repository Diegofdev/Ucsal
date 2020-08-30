package atvOO;


//Crie uma porta, abra e feche a mesma, pinte-a de diversas cores, altere suas dimens�es e use o m�todo estaAberta para verificar se ela est� aberta

public class Porta {

	boolean aberta;
	String cor;
	int dimensaoX;
	int dimensaoY;
	int dimensaoZ;
	
	public void abre() {
		aberta = true;
	}
	public void fecha() {
		aberta = false;
	}
	public void pinta(String s) {
		cor = s;
	}
	boolean estaAberta() {
		return aberta;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Porta p1 = new Porta();
		p1.aberta = false;
		p1.cor = "preta";
		p1.dimensaoX = 200;
		p1.dimensaoY = 60;
		p1.dimensaoZ = 5;
		
		System.out.println("A porta est� aberta? "+ p1.estaAberta() + " A cor da porta � "+ p1.cor + " E as dimens�es da porta s�o: "+ p1.dimensaoX+ " " + p1.dimensaoY + " " + p1.dimensaoZ);
		
		p1.abre();
		
		System.out.println("A porta est� aberta? "+ p1.estaAberta() + " A cor da porta � "+ p1.cor + " E as dimens�es da porta s�o: "+ p1.dimensaoX+ " " + p1.dimensaoY + " " + p1.dimensaoZ);
		
		p1.fecha();
		
		System.out.println("A porta est� aberta? "+ p1.estaAberta() + " A cor da porta � "+ p1.cor + " E as dimens�es da porta s�o: "+ p1.dimensaoX+ " " + p1.dimensaoY + " " + p1.dimensaoZ);
		
		p1.pinta("Vermelha");
		
		System.out.println("A porta est� aberta? "+ p1.estaAberta() + " A cor da porta � "+ p1.cor + " E as dimens�es da porta s�o: "+ p1.dimensaoX+ " " + p1.dimensaoY + " " + p1.dimensaoZ);
		
		p1.pinta("Azul");
		
		System.out.println("A porta est� aberta? "+ p1.estaAberta() + " A cor da porta � "+ p1.cor + " E as dimens�es da porta s�o: "+ p1.dimensaoX+ " " + p1.dimensaoY + " " + p1.dimensaoZ);
		
		p1.dimensaoX = 250;
		p1.dimensaoY = 80;
		p1.dimensaoZ = 8;
		
		System.out.println("A porta est� aberta? "+ p1.estaAberta() + " A cor da porta � "+ p1.cor + " E as dimens�es da porta s�o: "+ p1.dimensaoX+ " " + p1.dimensaoY + " " + p1.dimensaoZ);
		
		
		

	}

}
