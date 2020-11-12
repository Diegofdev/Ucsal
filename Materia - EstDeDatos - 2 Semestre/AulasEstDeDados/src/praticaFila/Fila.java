package praticaFila;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Diego");
		fila.add("Paula");
		fila.add("Gregore");
		fila.add("Juca");
		
		System.out.println("A sua fila tem " + fila.size() + " elementos.");
		
		Iterator<String> it = fila.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		if(fila.size() > 0) {
			fila.remove();
		}
		
		System.out.println("O primeiro elemento da fila é : " + fila.peek()) ;

	}

}
