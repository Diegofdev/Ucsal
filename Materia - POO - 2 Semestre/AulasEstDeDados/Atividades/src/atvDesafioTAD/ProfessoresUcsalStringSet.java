package atvDesafioTAD;

public class ProfessoresUcsalStringSet implements ProfessoresSet {

	private String[] nome;
	private int size;
	private String materia;
	private String escola;
	
	public ProfessoresUcsalStringSet (String[] nome, int size, String materia, String escola) {
		super();
		this.nome = nome;
		this.size = size;
		this.escola = escola;
		this.materia = materia;
	}
	
	@Override
	public boolean contains (String professor) {
		return false;
		
	}
	
	@Override
	public boolean add (String professor) {
		return false;
	}
	
	@Override
	public boolean remove (String professor) {
		return false;
	}
	
	@Override
	public int size() {
		return 0;
	}
	
	@Override
	public void clear() {
		
	}

}
