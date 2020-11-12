package br.ucsal.lab.tarefas.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import br.ucsal.lab.tarefas.Linha;
import br.ucsal.lab.tarefas.Lista;
import br.ucsal.lab.tarefas.Tarefa;


public class InterfaceGrafica extends JFrame {


	private static final long serialVersionUID = 1L;
	private JTextField titulo = new JTextField();
	private JTextField descricao = new JTextField();
	private JCheckBox concluida = new JCheckBox();
	private JButton adicionar = new JButton("Adicionar");

	private JButton salvar = new JButton("Salvar");
	private JButton atualizar = new JButton("Atualizar");

	private Vector<String> colunas = new Vector<String>();
	private Vector<Vector<String>> dados = new Vector<>();

	private Lista listaTarefas;

	public InterfaceGrafica(Lista lista) {
		super("Tarefas");
		this.listaTarefas = lista;

		JPanel formulario = new JPanel(new GridLayout(4, 2));
		formulario.add(new JLabel("Titulo:"));
		formulario.add(titulo);
		formulario.add(new JLabel("Descrição:"));
		formulario.add(descricao);
		formulario.add(new JLabel("Concluida:"));
		formulario.add(concluida);
		formulario.add(new JLabel(""));
		formulario.add(salvar);

		JPanel botoes = new JPanel(new GridLayout(1, 3));
		botoes.add(atualizar);
		botoes.add(adicionar);
		
		this.add(botoes, BorderLayout.SOUTH);

		final JDialog frame = new JDialog(this, "ADICIONAR", true);
		frame.getContentPane().add(formulario);
		frame.pack();
		frame.setLocationRelativeTo(null);


		colunas.add("TITULO");
		colunas.add("DESCRIÇÃO");
		colunas.add("");
		JTable tabela = new JTable(dados, colunas);
		JScrollPane centro = new JScrollPane(tabela);
		this.add(centro);

		adicionar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(true);
			}
		});

		/*atualizar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dados.clear();
				
				for (Tarefa tarefa : listaTarefas.getTarefas()) {
					Vector<String> row = new Vector<>();
					row.add(tarefa.getTitulo());
					row.add(tarefa.getDescricao());
					row.add(tarefa.getConcluida().toString());
					
					
				
					dados.add(row);
				}
				tabela.setModel(new DefaultTableModel(dados, colunas));


			}
		});*/
		
		atualizar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dados.clear();
				
				for (Linha linha : listaTarefas.getTarefas()) {
					Vector<String> row = new Vector<>();
					row.add(linha.coluna1());
					row.add(linha.coluna2());
					row.add(linha.coluna3());
					
					
				
					dados.add(row);
				}
				tabela.setModel(new DefaultTableModel(dados, colunas));


			}
		});

		salvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String t = titulo.getText();
				String d = descricao.getText();
				Boolean c = concluida.isSelected();
				listaTarefas.adicionarTarefa(t, d, c);
				frame.setVisible(false);
			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 400);
		this.setLocationRelativeTo(null);
		
		this.setVisible(true);

	}

}
