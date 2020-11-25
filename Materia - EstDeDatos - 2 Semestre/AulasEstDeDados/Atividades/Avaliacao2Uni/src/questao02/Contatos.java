package questao02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;





public class Contatos {
	
	Queue<Entrevistado> entrevistados = new LinkedList<Entrevistado>();
	
	public void inserirEntrevistado() {
		Scanner sc = new Scanner(System.in);
		Entrevistado entrevistado = new Entrevistado();
		System.out.println("Digite o nome do Entrevistado: ");
		entrevistado.setNome(sc.nextLine());
		System.out.println("Digite a idade do Entrevistado: ");
		entrevistado.setIdade(sc.nextInt());
		entrevistados.add(entrevistado);
	}
	
	public void proximoEntrevistado() {
		System.out.println("O entrevistado: " + entrevistados.poll().getNome().toUpperCase() + " Acaba de ser atendido e foi removido da fila");
	}

}
