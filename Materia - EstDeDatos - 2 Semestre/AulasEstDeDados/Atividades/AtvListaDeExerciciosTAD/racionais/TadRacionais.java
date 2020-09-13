package racionais;

public class TadRacionais {

	public static void main(String[] args) {
		Racional racional = new Racional();
        racional.criarRacional(5, 6);
        System.out.println(racional.getRacional());
        System.out.println(racional.somarRacionais(5.4546, 6.4564));
        System.out.println(racional.multiplicarRacionais(5.4447878, 6.464564));
        System.out.println(racional.testarIgualdade(5, 5));

	}

}
