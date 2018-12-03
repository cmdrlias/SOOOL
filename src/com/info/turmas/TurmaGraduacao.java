package com.info.turmas;

import com.config.SystemMessages;
import com.info.discente.Aluno;

public class TurmaGraduacao extends Turma {
	private int semestreTurma;
	private int anoTurma;
	
	public TurmaGraduacao(int codSequencia, int semestre, int ano) {
		super(codSequencia);
		this.semestreTurma = semestre;
		this.anoTurma = ano;
	}
	
	public String verificaAluno(String nome) {
		try {
			for(Aluno a : alunos) {
				if(a.getNomeAluno().equalsIgnoreCase(nome))
					return a.getMatriculaAluno();
			}
		} catch(Exception ex) {
			return SystemMessages.TURMA_ALUNO_NAO_ENCONTRADO.getMessage();
		}
		return "Aluno pesquisado: " + nome;
	}
	
	// TODO
	// um aluno só pode fazer parte de uma turma,
	// caso tenha cumprido a quantidade mínima de créditos (atributo quantMinCredito de Disciplina) da
	// disciplina da turma. Caso contrário, deve ser disparada a exceção da classe Exceção. Um número
	// de erro e sua mensagem devem ser especificados para essa situação.

	public int getSemestreTurma() {
		return semestreTurma;
	}

	public void setSemestreTurma(int semestreTurma) {
		this.semestreTurma = semestreTurma;
	}

	public int getAnoTurma() {
		return anoTurma;
	}

	public void setAnoTurma(int anoTurma) {
		this.anoTurma = anoTurma;
	}
}
