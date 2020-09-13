package racionais;

public class Racional implements ContratoRacionais {

    private double racional;

    @Override
    public void criarRacional(double a, double b) {
        
        if (b != 0) {
            this.racional = a/b;
        } else {
            System.out.println("Não existe.");
        }
    }

    @Override
    public double somarRacionais(double a, double b) {
       
        return (a+b);
    }

    @Override
    public double multiplicarRacionais(double a, double b) {
       
        return (a*b);
    }

    @Override
    public double testarIgualdade(double a, double b) {
       
        if (a == b) {
            return 1;
        } else {
            return 0;
        }
    }

    public double getRacional() {
        return racional;
    }


}
