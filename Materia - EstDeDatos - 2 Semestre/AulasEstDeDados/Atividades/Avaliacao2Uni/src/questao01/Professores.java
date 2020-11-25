package questao01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class Professores {
	
	Queue<Professor> filaprofessores = new LinkedList<Professor>();
	PilhaProfs pilhaprofessores = new PilhaProfs(100);
	
	public void inserirProfessor() {
		Scanner sc = new Scanner(System.in);
		Professor professor = new Professor();
		System.out.println("Digite o nome do Professor: ");
		professor.setNome(sc.nextLine().toUpperCase());
		System.out.println("Digite a area do Professor ( Digite E para Exatas e H para Humanas: ");
		professor.setArea(sc.next().toUpperCase());
		if (professor.getArea().toUpperCase().contentEquals("E")) {
			pilhaprofessores.inserir(professor);
		} else {
			filaprofessores.add(professor);
		}
		
		
	}
	
	public void listarPilha() {
		pilhaprofessores.listarPilha();
	}
	
	public void listarFila() {
		for (Professor professor : filaprofessores) {
			System.out.println(professor);
		}
	}

}
