package br.ucsal;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

import java.util.Stack;



public class FilaProva {
	Stack<Integer> pilha = new Stack<Integer>();
	Queue<Integer> fila = new LinkedList<Integer>();
	
	int[] numeros = new int[10];
	
	public void CriarDezNumerosAleatorios() {
		Random gerador = new Random();
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=gerador.nextInt(1000);
			System.out.println("Criado o numero " + numeros[i]);
		}
	}
	
	public void AdicionarNumerosNaFila() {
		for (int i = 0; i < numeros.length; i++) {
			fila.add(numeros[i]);
			System.out.println("Adicionando o numero "+ numeros[i] + " a fila");
		}
	}
	
	public void ListarFila() {
		System.out.println("\nlistando elementos da fila...\n");
		
		Iterator<Integer> itr = fila.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	public void TransformarFilaEmPilha() {
		System.out.println("\n Enviando itens da fila para a pilha...\n");
		
		for (Integer i : fila) {
			System.out.println("Enviando " + i + " para a pilha...");
			pilha.push(i);
		}
	}
	
	public void ListarPilha() {
		System.out.println("\nlistando elementos da pilha...\n");
		for (Integer i : pilha) {
			System.out.println(i);
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		FilaProva numeros = new FilaProva();
		
		
		numeros.CriarDezNumerosAleatorios();
		
		numeros.AdicionarNumerosNaFila();
		
		numeros.ListarFila();
		
		numeros.TransformarFilaEmPilha();
		
		numeros.ListarPilha();
		
		
	}

}
