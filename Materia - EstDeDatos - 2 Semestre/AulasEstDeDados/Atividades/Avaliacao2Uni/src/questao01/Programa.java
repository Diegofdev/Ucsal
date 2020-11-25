package questao01;

public class Programa {

	public static void main(String[] args) {
		Professores professores = new Professores();
		
		professores.inserirProfessor();
		professores.inserirProfessor();
		professores.inserirProfessor();
		professores.inserirProfessor();
		
		professores.listarFila();
		
		System.out.println("");
		
		professores.listarPilha();

	}

}
