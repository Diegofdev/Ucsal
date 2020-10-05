package br.ucsal.professoresUcsal;

public class MainProf {

	public static void main(String[] args) {
		ListaProfessor lista = new ListaProfessor();
		Professor p1 = new Professor("Fernando");
		Professor p2 = new Professor("Semiramis");
		Professor p3 = new Professor("Mario");
		Professor p4 = new Professor("Angela");	
		Professor p5 = new Professor("Marco");	
		
		lista.inserirPrimeiro(p1);
		lista.inserirPrimeiro(p2);
		lista.inserirPrimeiro(p3);
		lista.inserirPrimeiro(p4);	
		lista.inserirPrimeiro(p5);
		
		lista.listarProfessores();
		lista.tamanhoAtual();
		
		lista.removerUltimo();
		lista.listarProfessores();
		lista.tamanhoAtual();		

		lista.listaVazia();
		lista.excluirTudo();
		lista.tamanhoAtual();
		lista.listaVazia();

	}

}
