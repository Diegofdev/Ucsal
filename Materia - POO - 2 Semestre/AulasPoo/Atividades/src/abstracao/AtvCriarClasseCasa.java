package abstracao;
//Represente por meio de uma classe uma casa. *

public class AtvCriarClasseCasa {
//public class casa
	
	String cor;
	int andares;
	int qtdQuartos;
	int qtdBanheiros;
	boolean possuiGaragem;
	int numeroCasa;
	
	
	void tocarCampainha() {
		System.out.println("Tocando Campainha");
	}
	void entrarNaCasa() {
		System.out.println("Entrando na casa");
	}
	void sairDaCasa() {
		System.out.println("Saindo da casa");
	}
	void estacionar() {
		if(possuiGaragem == true) {
			System.out.println("Estacionando na garagem");
		} else {
			System.out.println("A Casa não possui garagem");
		}
	}
	int perguntarNumeroDaCasa() {
		return numeroCasa;
	}
	
}
