package calculoFatorial;

public class Fatorial {
	
	public static int calculaFatorial (int a, int b) {
		int r;
		r= a*b;
		return r;
	}

	public static void main(String[] args) {
		int fat = 7; //INSIRA O VALOR PARA CALCULO DO FATORIAL
		int fatr = 0;
		for (int i = fat, b = fat -1; b > 0; ) {
			
			i = calculaFatorial(i, b);
			b = b-1;
			fatr = i;
			
		}
		System.out.println(fatr);

	}

}
