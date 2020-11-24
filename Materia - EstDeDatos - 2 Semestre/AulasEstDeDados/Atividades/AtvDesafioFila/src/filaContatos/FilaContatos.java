package filaContatos;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaContatos {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Pessoa> contatos = new LinkedList<Pessoa>();
		
		for (int i = 1; i < 4; i++) {
			System.out.println("Digite as informações do " + i + "º contato");
			Pessoa pessoa = new Pessoa();
			System.out.println("Nome: ");
			pessoa.setNome(sc.next());
			System.out.println("Idade: ");
			pessoa.setIdade(sc.nextInt());
			System.out.println("Telefone: ");
			pessoa.setTelefone(sc.nextInt());
			
			contatos.add(pessoa);
		}
		
		for (Pessoa pessoa : contatos) {
			System.out.println(pessoa);
		}
		
		System.out.println("Removendo primeiro contato da fila:");
		System.out.println(contatos.poll());
		
		
		System.out.println("Fila atual: ");
		for (Pessoa pessoa : contatos) {
			System.out.println(pessoa);
		}
	}
	
	
}
