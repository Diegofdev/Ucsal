package provaQ2RecursivoSoma;

import java.util.Scanner;

public class SomaRecursiva {
	
	public static int soma(int num){
        if ( num == 1) {
        	return 1;
        } else {
        	return num + soma(num - 1);
        }
        
    }

    
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = input.nextInt();
        int soma = soma(num);
        System.out.println("A soma dos algarismos é: " + soma);
    }

}
