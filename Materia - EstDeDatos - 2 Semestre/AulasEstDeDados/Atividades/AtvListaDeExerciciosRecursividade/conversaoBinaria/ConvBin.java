package conversaoBinaria;

public class ConvBin {
	
	public static int conversor (int n) {
		int r;
		r = n%2;
		return r;
	}

	public static void main(String[] args) {
		String bin = "";
		for (int i = 37; i > 0;) {
			
			bin = bin + conversor(i);
			i = i/2;
		}
		bin.toCharArray();
		for (int i = bin.length(); i != 0;) {
			System.out.print(bin.charAt(i-1));
			i--;
		}

	}

}
