package br.ucsal;

import java.util.ArrayList;

public class Evento {
	
	private String nome;
	private String data;
	private double preco;
	
	private ArrayList<Convidado> convidados = new ArrayList<Convidado>();

	public Evento(String nome, String data, double preco) {
		
		this.nome = nome;
		this.data = data;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public ArrayList<Convidado> getConvidados() {
		return convidados;
	}

	public void setConvidados(ArrayList<Convidado> convidados) {
		this.convidados = convidados;
	}
	
	public void adicionarConvidado(Convidado convidado) {
		this.convidados.add(convidado);
	}
	
	public void totalConvidados(){
        System.out.println("O total de convidados presentes é " + convidados.size());
        
	}
	
	public int listarConvidados(){
		int presentes = 0;
        for (Convidado convidados: this.convidados) {
        	if( convidados.getPresente() == true) {
        		presentes++;
        	}
        }
        return presentes;
	}

}
