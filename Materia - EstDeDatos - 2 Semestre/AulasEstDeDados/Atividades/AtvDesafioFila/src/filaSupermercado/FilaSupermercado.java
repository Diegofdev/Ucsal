package filaSupermercado;

import java.util.LinkedList;
import java.util.Queue;

import filaContatos.Pessoa;

public class FilaSupermercado {

	public static void main(String[] args) {
		Queue<String> clientes = new LinkedList<String>();
		clientes.add("Julio");
		clientes.add("Paulo");
		clientes.add("Roberto");
		clientes.add("Flavio");
		clientes.add("Roberta");
		clientes.add("Ana");
		
		System.out.println("A fila neste momento está com: " + clientes.size() + " Clientes.");

	}

}
