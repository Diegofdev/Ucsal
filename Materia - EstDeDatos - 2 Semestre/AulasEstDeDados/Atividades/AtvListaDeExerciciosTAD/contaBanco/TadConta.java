package contaBanco;

public class TadConta {

	public static void main(String[] args) {
		Conta c = new Conta();
        System.out.println(c.saldo());
        c.depositar(600);
        c.sacar(50);
	}

}
