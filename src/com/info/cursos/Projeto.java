package com.info.cursos;

import java.util.ArrayList;

import com.config.SystemMessages;

public class Projeto {
	private String nomeProjeto;
	private String descricaoProjeto;
	
	private ArrayList<Curso> cursos = new ArrayList<Curso>();
	 
	public Projeto(String nome, String descricao, Curso curso) {
		this.nomeProjeto = nome;
		this.descricaoProjeto = descricao;
		cursos.add(curso);
	}

	public String adicionaCurso(Curso curso) {
		try {
			cursos.add(curso);
			return SystemMessages.PROJETO_CURSO_ADICIONADO_SUCESSO.getMessage();
		} catch(Exception ex) {
			return SystemMessages.ERRO_INTERNO.getMessage();
		}
	}
	
	public String getNomeProjeto() {
		return nomeProjeto;
	}

	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}

	public String getDescricaoProjeto() {
		return descricaoProjeto;
	}

	public void setDescricaoProjeto(String descricaoProjeto) {
		this.descricaoProjeto = descricaoProjeto;
	}

	public ArrayList<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}
}
