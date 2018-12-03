package com.info.docente;

import java.util.ArrayList;

import com.config.SystemMessages;
import com.info.turmas.Aula;

public class Professor {
	private String nomeProfessor;
	private String titulacaoProfessor;
	private String cpfProfessor;
	
	public ArrayList<Aula> aulas = new ArrayList<Aula>();
	
	public Professor(String nome, String titulacao, String cpf) {
		this.nomeProfessor = nome;
		this.titulacaoProfessor = titulacao;
		this.cpfProfessor = cpf;
	}
	
	public String adicionaAula(Aula aula) {
		try {
			aulas.add(aula);
			return SystemMessages.PROFESSOR_AULA_ADICIONADA_SUCESSO.getMessage();
		} catch(Exception ex) {
			return SystemMessages.ERRO_INTERNO.getMessage();
		}
	}
	
	
	// TODO
	// Regra de negócio sob exceção (Fazer na Etapa 3): um professor não pode lecionar diferentes
	// disciplinas ou em diferentes turmas no mesmo horário de aula em um dia da semana. Se isso
	// ocorrer, deve ser disparada a exceção da classe Exceção, impossibilitando a alocação daquele
	// horário de aula para o professor. Um número de erro e a respectiva mensagem devem ser
	// especificados.
	
	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

	public String getTitulacaoProfessor() {
		return titulacaoProfessor;
	}

	public void setTitulacaoProfessor(String titulacaoProfessor) {
		this.titulacaoProfessor = titulacaoProfessor;
	}

	public String getCpfProfessor() {
		return cpfProfessor;
	}

	public void setCpfProfessor(String cpfProfessor) {
		this.cpfProfessor = cpfProfessor;
	}
}
