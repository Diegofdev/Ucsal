package atvDesafioTAD;

public interface ProfessoresSet {
	
	public boolean contains(String professor); // Retorna true se x esta no conjunto
	   public boolean add(String professor);      // Adiciona x ao conjunto
	   public boolean remove(String professor);   // Remove x do conjunto
	   public int     size();          // Retorna o numero de elementos do conjunto
	   public void    clear();         // Limpa o conjunto (torna-o vazio)

}
