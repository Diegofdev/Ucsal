package atvDesafioTAD2;



public class DisciplinaStringSet implements DisciplinaSet {

	private String[] nome;
	private int horas;
	private String curso;
	private String instituicao;
	private String professor;
	
	public DisciplinaStringSet (String[] nome, int horas, String curso, String instituicao, String professor) {
		super();
		this.nome = nome;
		this.horas = horas;
		this.instituicao = instituicao;
		this.curso = curso;
		this.professor = professor;
	}
	
	@Override
	public boolean contains (String disciplina) {
		return false;
		
	}
	
	@Override
	public boolean add (String disciplina) {
		return false;
	}
	
	@Override
	public boolean remove (String disciplina) {
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
