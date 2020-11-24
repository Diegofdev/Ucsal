package filaAlunos;


import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;



public class Alunos {

	public static void main(String[] args) {
		Queue<Aluno> alunos = new LinkedList<Aluno>();
		
		alunos.add(new Aluno("Carla", 22));
		
		alunos.add(new Aluno("Joao", 19));
		
		alunos.add(new Aluno("Paula", 27));
	
		alunos.add(new Aluno("Mirian", 23));
	
		alunos.add(new Aluno("Beto", 21));
		
		alunos.add(new Aluno("Joana", 42));
		
		System.out.println("A lista de alunos por ordem de idade é ");
		List<Integer> idades = new ArrayList<>();
		for (Aluno a : alunos) {
			idades.add(a.getIdade());
		}
		Collections.sort(idades);
		for (Integer i : idades) {
			for (Aluno a : alunos) {
				if ( i == a.getIdade()) {
					System.out.println(a);
				}
			}
		}
		

	}

}
