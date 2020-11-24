package filaPacientes;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class ListaPacientes {

	Queue<Pacientes> pacientes = new LinkedList<Pacientes>();
	
	
	public void adicionarPaciente() {
		Scanner sc = new Scanner(System.in);
		Pacientes paciente = new Pacientes();
		System.out.println("Digite o nome do Paciente: ");
		paciente.setNome(sc.nextLine());
		System.out.println("Digite a idade do Paciente: ");
		paciente.setIdade(sc.nextInt());
		pacientes.add(paciente);
	}
	
	public void listarPacientes() {
		System.out.println("A Fila atual de pacientes é: ");
		for (Pacientes u : pacientes) {
			System.out.println(u);
		}
	}
	
	public void atenderPaciente() {
		System.out.println("O paciente: " + pacientes.poll().getNome() + " Acaba de ser atendido e foi removido da fila");
	}
	
	public void verificarFila() {
		if(pacientes.size() < 1) {
			System.out.println("Não há pacientes na fila");
		} else {
			System.out.println("Ainda tem " + pacientes.size() + " pacientes na fila");
		}
	}
	
	public void proximoPaciente() {
		System.out.println("O proximo paciente a ser atendido é: " + pacientes.peek().getNome());
	}
	
	
}
