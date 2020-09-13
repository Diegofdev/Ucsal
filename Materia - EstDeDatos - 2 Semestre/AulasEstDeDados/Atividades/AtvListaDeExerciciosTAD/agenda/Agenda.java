package agenda;

import java.util.*;

public class Agenda {
	 private List<Integer> agenda = new ArrayList<Integer>();

	    public void adicionar(int numero) {
	        this.agenda.add(numero);
	    }
	    public void excluir(int numero) {
	        if (this.agenda.contains(numero)) {
	            int i = this.agenda.indexOf(numero);
	            this.agenda.remove(i);
	        }
	    }
	    public void atualizar() {
	        for (Object i : this.agenda) {
	            System.out.println(i);
	        }
	    }

}
