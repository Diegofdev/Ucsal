package atvDesafioTAD2;

public interface DisciplinaSet {
	
	public boolean contains(String disciplina); // Retorna true se x esta no conjunto
	   public boolean add(String disciplina);      // Adiciona x ao conjunto
	   public boolean remove(String disciplina);   // Remove x do conjunto
	   public int     size();          // Retorna o numero de elementos do conjunto
	   public void    clear();         // Limpa o conjunto (torna-o vazio)

}
