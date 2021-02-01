package testeProva1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ListaCarros {
	
	
	Stack<Carro> pilha = new Stack<Carro>();
	Queue<Carro> fila = new LinkedList<Carro>();
	
	public void inserirCarro(String nome, String marca) {
		Carro carro = new Carro(nome, marca);
		if(carro.getFabricante().toLowerCase() == "toyota") {
			pilha.push(carro);
		} else {
			fila.add(carro);
		}
		
	}
	
	public void listarFila() {
		System.out.println("Listando Fila \n");
		for (Carro carro : fila) {
			System.out.println(carro);
		}
	}
	
	public void listarPilha() {
		System.out.println("Listando Pilha \n");
		for (Carro carro : pilha) {
			System.out.println(carro);
		}
	}
	
	

}
