package questao04;

public class Servicos {

	public String[] servicos;
    public int posicaoPilha;
    public String proxServico;

    public Servicos(int tamanhoPilha) {
        this.posicaoPilha = -1;
        

        this.servicos = new String[tamanhoPilha];
        

    }
    
    private boolean pilhaVazia() {
        //isEmpty
        if (this.posicaoPilha == -1) {
            return true;
        }
        return false;
    }


    public void inserir(String n) {
        // push
        if (this.posicaoPilha < this.servicos.length - 1) {
            this.servicos[++posicaoPilha] = n;
        }
        proxServico = servicos[posicaoPilha];
    }
    
    public String obterProximo() {
    	
    	if(pilhaVazia()) {
    		return null;
    	}
    	proxServico = servicos[posicaoPilha-1];
    	return proxServico;
    	
    }
    
    
    	
    

    public static void main(String args[]) {
       Servicos servico = new Servicos(20);
       servico.inserir("Limpar a casa");
       servico.inserir("Montar a cama");
       servico.inserir("Lavar o carro");
       servico.obterProximo();
       
       
       
               
            System.out.println(servico.obterProximo());
        
    }

}
