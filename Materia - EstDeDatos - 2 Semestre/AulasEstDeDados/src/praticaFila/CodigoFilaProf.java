package praticaFila;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class CodigoFilaProf {

	public static void main(String[] args) {
		//criação de uma fila que deve receber números 
		Queue<Integer> fila = new LinkedList<Integer>();
		
		//vamos testar se a fila foi criada??
		if(fila.isEmpty()) {
			System.out.println("Olha bem, sua fila foi criada, mas você não adicionou elementos ainda! ");
		} else {
			System.out.println("Olha você não criou a fila!!");
		}
		//aqui a profa adicionou os elementos na fila
		fila.add(0);
		fila.add(1);
		fila.add(2);
		fila.add(3);
		fila.add(4);
		fila.add(5);
		fila.add(6);
		fila.add(7);
		fila.add(8);
		fila.add(9);
		fila.add(10);

		//Vamos verificar novamente a situação da nossa fila agora?
		
		System.out.println("Após a adição de elementos");
		
		if(!fila.isEmpty()) {
			System.out.println("A sua fila não esta vazia!! ");
		} 
		
		//vamos verificar o tamanho da nossa fila?
		System.out.println("Verificando o tamanho da fila...");
		System.out.println("A sua fila tem " + fila.size() + " elementos que adicionamos na fila.");
		
		//vamos remover uns elementos??
		if(fila.size() > 0) {
			fila.remove();
		}
		
		System.out.println("A sua fila tem " + fila.size() + " elementos que adicionamos na fila, após a remoção.");
	
	//vamos verificar quem é o nosso primeiro elemento da fila?
		System.out.println("O primeiro elemento da fila é : " + fila.peek()) ;
		
		//vamos remover uns elementos??
		if(fila.size() > 0) {
			fila.poll();
		}
		System.out.println("A sua fila tem " + fila.size() + " elementos que adicionamos na fila, após a remoção.");
		
		//vamos verificar quem é o nosso primeiro elemento da fila?
			System.out.println("O primeiro elemento da fila é : " + fila.peek()) ;
		
	//Vamos percorrer toda a nossa fila 
		System.out.println("Os elementos que estão na fila são:");
		Iterator<Integer> it = fila.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
