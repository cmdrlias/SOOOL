package com.academico.cursos;

import java.util.ArrayList;

import com.academico.discente.Aluno;
import com.academico.instituicao.Instituicao;

public class Curso {
	private String codigoCurso;
	private String nomeCurso;
	private String turnoCurso;
	
	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	private ArrayList<Instituicao> instituicoes  = new ArrayList<Instituicao>();
	private ArrayList<Projeto> projetos = new ArrayList<Projeto>();
	
	public Curso(String codigo, String nome, String turno) {
		this.codigoCurso = codigo;
		this.nomeCurso = nome;
		this.turnoCurso = turno;
	}
	
	public void adicionarAluno(Aluno a) {
		alunos.add(a);
	}
	
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	
	public void adicionarInstituicao(Instituicao i) {
		instituicoes.add(i);
	}
	
	public ArrayList<Instituicao> getInstituicoes() {
		return instituicoes;
	}
	
	public void adicionarProjeto(String nome, String desc) {
		Projeto p = new Projeto(nome, desc, new Curso(this.codigoCurso, this.nomeCurso, this.turnoCurso));
		projetos.add(p);
	}
	
	public ArrayList<Projeto> getProjetos() {
		return projetos;
	}

	public String getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(String codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getTurnoCurso() {
		return turnoCurso;
	}

	public void setTurnoCurso(String turnoCurso) {
		this.turnoCurso = turnoCurso;
	}
}
