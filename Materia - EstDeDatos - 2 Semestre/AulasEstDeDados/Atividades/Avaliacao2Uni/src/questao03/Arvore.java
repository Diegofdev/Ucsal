package questao03;

public class Arvore {
	 
	static class Node {    
		int numero; 
		Node esquerda, direita; 
 
		Node(int n){
			this.numero = n; 
			esquerda = null; 
			direita = null;
		}
	} 
 
	int contador = 0;
 
	public void inserir(Node node, int valor) {
		if (contador <= 10) {
			if (valor % 2 != 0) {
				if (valor < node.numero) { 
					if (node.esquerda != null) { 
						inserir(node.esquerda, valor);						
					} else { 
						System.out.println("Inserido valor de (" + valor + ") na esquerda de " + node.numero); 
						node.esquerda = new Node(valor);
						contador++;						
					} 
				} else if (valor > node.numero) {
					if (node.direita != null) {
						inserir(node.direita, valor);						
					} else {
						System.out.println("Inserido valor de (" + valor + ") na direita de " + node.numero);
						node.direita = new Node(valor);
						contador++;						
					}
				}
			} else {
				System.out.println("O número precisa ser impar.");
			}
			
		} else {
			System.out.println("Número máximo foi atingido.");
		}
	}
 
	public void percorrerPosOrdem(Node atual) {
		if (atual != null) {
			percorrerPosOrdem(atual.esquerda);
			percorrerPosOrdem(atual.direita);
			System.out.print(" " + atual.numero);
		}
	}
 
	public static void main(String args[]) { 
		Arvore arvore = new Arvore();
 
		Node raiz = new Node(255);		
 
		System.out.println("Valor da raiz é: >>> " + raiz.numero + " <<<");
		arvore.inserir(raiz, 15);
		arvore.inserir(raiz, 17);
		arvore.inserir(raiz, 29);
		arvore.inserir(raiz, 333);
		arvore.inserir(raiz, 3);
		arvore.inserir(raiz, 21);
		arvore.inserir(raiz, 87);
		arvore.inserir(raiz, 145);
		arvore.inserir(raiz, 41);
		arvore.inserir(raiz, 39);
		
 
		System.out.println("\nPercorrendo a arvore em Pos ordem:");
		arvore.percorrerPosOrdem(raiz);
	}
}
