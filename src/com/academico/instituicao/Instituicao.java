package com.academico.instituicao;

import java.util.ArrayList;

import com.academico.cursos.Curso;
import com.sistema.config.SystemMessages;

public class Instituicao {
	private String nomeInstituicao;
	private String cidadeInstituicao;
	private String estadoInstituicao;
	
	private ArrayList<Campus> campi = new ArrayList<Campus>();
	private ArrayList<Curso> cursos = new ArrayList<Curso>();
	
	public Instituicao(String nome, String cidade, String estado) {
		this.nomeInstituicao = nome;
		this.cidadeInstituicao = cidade;
		this.estadoInstituicao = estado;
	}
	
	public String adicionaCampus(Campus campus) {
		try {
			campi.add(campus);
			return SystemMessages.CAMPUS_INSTITUTO_ADICIONADO_SUCESSO.getMessage();
		} catch(Exception ex) {
			return SystemMessages.ERRO_INTERNO.getMessage();
		}
	}
	
	public String adicionaCurso(Curso curso) {
		try {
			cursos.add(curso);
			return SystemMessages.INSTITUICAO_CURSO_ADICIONADO_SUCESSO.getMessage();
		} catch(Exception ex) {
			return SystemMessages.ERRO_INTERNO.getMessage();
		}
	}
	
	public String getNomeInstituicao() {
		return nomeInstituicao;
	}
	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}
	public String getCidadeInstituicao() {
		return cidadeInstituicao;
	}
	public void setCidadeInstituicao(String cidadeInstituicao) {
		this.cidadeInstituicao = cidadeInstituicao;
	}
	public String getEstadoInstituicao() {
		return estadoInstituicao;
	}
	public void setEstadoInstituicao(String estadoInstituicao) {
		this.estadoInstituicao = estadoInstituicao;
	}

}
