package br.ucsal.matriculas;

public class MainAluno {
	
public static void main(String[] args) {
		
		ListaAluno lista = new ListaAluno();
		Aluno a1 = new Aluno("Diego", 87451);
		Aluno a2 = new Aluno("Artur", 78965);
		Aluno a3 = new Aluno("Luana", 25416);
		
		lista.adicionar(a1);
		lista.adicionar(a2);
		lista.adicionar(a3);
		lista.imprimirLista();
		
		lista.pesquisar("Diego");
		
		lista.ordenar(); // Apenas lista em ordem alfabética
		
		lista.remover();
		lista.imprimirLista();
		
		lista.pesquisar("Diego");
		

	}

}
