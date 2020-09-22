package calculoMDC;

public class MDC {
	public static int calculaMDC(int m, int n){
		int r;
		r = m%n;
		return r; 
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3200; // INSERIR PRIMEIRO VALOR
		int b = 500;  // INSERIR SEGUNDO VALOR
		for (int i = 10; i != 0; ) {
			
			i = calculaMDC(a, b);
			a = b;
			b = i;
		}
		System.out.println(a);

	}

}
