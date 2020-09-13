package contaBanco;

public class Conta {
	 private double saldo = 0;

	    public double saldo() {
	        return saldo;
	    }
	    public void depositar(double valor) {
	        this.saldo += valor;
	        atualizar();
	    }
	    public void sacar(double valor) {
	        if (valor > this.saldo) {
	            System.out.println("Saldo indisponível.");

	        }
	        else if (valor < 0) {
	            System.out.println("Error 404");
	        } else {
	            this.saldo -= valor;
	        }
	        atualizar();
	    }
	    public void atualizar() {
	        System.out.println(this.saldo);
	    }

}
