package br.ucsal;
//Represente por meio de uma classe um Carro de Corrida, motor, velocidade, cilindradas e comportamento como virar a direita a esquerda, acelerar. *

public class AtvCriarClasseCarroDeCorrida {
//public class CarroDeCorrida{}
	
	String modelo;
	String marca;
	int velocidadeMaxima;
	int velocidade = 0;
	String cor;
	String placa;
	int ano;
	String dono;
	int potencia;
	
	void liga() {
		System.out.println("O Carro está ligado");
	}
	
	void desliga() {
		System.out.println("O carro está desligado");
	}
	
	void virarEsquerda() {
		System.out.println("O Carro virou a esquerda");
	}
	void virarDireita() {
		System.out.println("O carro virou a direita");
	}
	void acelerar() {
		System.out.println("Acelerando");
		if (velocidade < velocidadeMaxima) {
		velocidade ++;
		} else {
			System.out.println("Você ja atingiu a velocidade maxima");
		}
	}
	void reduzir() {
		System.out.println("Reduzindo");
		if (velocidade == 0) {
			System.out.println("O carro está parado!");
		} else {
			velocidade --;
		}
	}
}
