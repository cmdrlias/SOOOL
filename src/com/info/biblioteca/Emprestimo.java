package com.info.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;

import com.info.discente.Aluno;

public class Emprestimo {
	private String dataEmprestimo;
	private String dataDevolucao;
	public HashMap<Livro, Aluno> livrosEmprestados = new HashMap<Livro, Aluno>();
	
	
	public Emprestimo(Aluno aluno, Livro livro, String dataEmprestimo, String dataDevolucao) {
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
		
		livrosEmprestados.put(livro, aluno);
	}
	
	public ArrayList<Aluno> pesquisarLivro(String nomeLivro) {
		try {
			ArrayList<Aluno> a = new ArrayList<Aluno>();
			for(Livro l : livrosEmprestados.keySet()) {
				if(l.getTituloLivro().equalsIgnoreCase(nomeLivro)) {
					a.add(livrosEmprestados.get(l));
				}
			}
			return a;
		} catch(Exception ex) {
			return null;
		}
	}
	
	// TODO
	// Método para pesquisar se existe algum aluno com um livro emprestado a mais de 7 dias desde a
	// data de empréstimo. O método não precisa de parâmetros, sendo necessário apenas obter a data
	// atual do sistema operacional. Se existem alunos assim, retornar uma coleção quer mapeia
	// (Sugestão: Map/HashMap), para cada matrícula de aluno, um número real referente ao valor da
	// multa de R$ 1.50 por dia de atraso. Caso contrário, uma lista vazia.

	public String getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(String dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public String getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
}
