package atvOO;

/* Crie uma pessoa, coloque seu nome e idade iniciais, fa�a alguns anivers�rios ( aumentando a idade ) e imprima seu nome e sua idade */

public class Pessoa {

	String nome;
	int idade;
	
	public void fazAniversario() {
		idade++;
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p1 = new Pessoa();
		p1.nome = "Ricardo";
		p1.idade = 20;
		
		System.out.println("O Nome � " + p1.nome + " e a idade � " + p1.idade);
		
		p1.fazAniversario();
		
		System.out.println("O Nome � " + p1.nome + " e a idade � " + p1.idade);
		
		p1.fazAniversario();
		
		System.out.println("O Nome � " + p1.nome + " e a idade � " + p1.idade);
		
		p1.fazAniversario();
		
		System.out.println("O Nome � " + p1.nome + " e a idade � " + p1.idade);
		

	}

}
