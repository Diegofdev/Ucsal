package br.ucsal;

public interface InterfaceCarro {
	
	public void adicionarCarro (int id, int ano, String fabricante, String carro);
	public void alterarCarro (String carro);
	public void excluirCarro (String carro);
	public void checarCarro (String carro);

}
