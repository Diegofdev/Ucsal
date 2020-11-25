package questao01;

public class PilhaProfs {
	
	public Professor[] professores;
    public int posicaoPilha;
    public Professor proxProfessor;

    public PilhaProfs(int tamanhoPilha) {
        this.posicaoPilha = -1;
        

        this.professores = new Professor[tamanhoPilha];
        

    }
    
    private boolean pilhaVazia() {
        //isEmpty
        if (this.posicaoPilha == -1) {
            return true;
        }
        return false;
    }


    public void inserir(Professor n) {
        // push
        if (this.posicaoPilha < this.professores.length - 1) {
            this.professores[++posicaoPilha] = n;
        }
        proxProfessor = professores[posicaoPilha];
    }
    
    public Professor obterProximo() {
    	
    	if(pilhaVazia()) {
    		return null;
    	}
    	proxProfessor = professores[posicaoPilha-1];
    	return proxProfessor;

}
    public void listarPilha() {
    	/*while (pilhaVazia() == false) {
			System.out.println(professores[posicaoPilha-1]);
			
		}*/
    	
    	for (int i = 0, a = professores.length-1; i < professores.length; i++, a--) {
    		if (professores[a] == null) {
    			
			} else {
				System.out.println(professores[a]);
			}
    		
    		//System.out.println(professores[posicaoPilha-1]);
		}
    }
}
