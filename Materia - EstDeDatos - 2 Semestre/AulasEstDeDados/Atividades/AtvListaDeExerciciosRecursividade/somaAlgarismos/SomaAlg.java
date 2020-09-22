package somaAlgarismos;

import java.util.Scanner;

public class SomaAlg {
	
	public static int soma(int num) {
		int numero = num%10;
		return numero;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		int resultado = 0;
		for (int i = numero, res = 0; i != 0;) {
			
			res = soma(i);
			resultado = resultado + res;
			i=i/10;
		}
		System.out.println(resultado);

	}

}
