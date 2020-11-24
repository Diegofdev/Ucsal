package filaPacientes;

public class FilaPacientes {

	public static void main(String[] args) {
		ListaPacientes pacientes = new ListaPacientes();
		
		pacientes.adicionarPaciente();
		pacientes.adicionarPaciente();
		
		pacientes.listarPacientes();
		
		pacientes.atenderPaciente();
		
		pacientes.listarPacientes();
		pacientes.verificarFila();
		pacientes.proximoPaciente();
		
		pacientes.atenderPaciente();
		
		pacientes.verificarFila();

	}

}
