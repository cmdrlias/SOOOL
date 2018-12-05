package com.academico.turmas;

import java.util.ArrayList;
import java.util.Date;

import com.sistema.config.SystemMessages;

public class Disciplina {
	public int cod = 0;
	
	private String codigoDisciplina;
	private String nomeDisciplina;
	private int cargaHorariaDisciplina;
	private int quantidadeCreditos;
	private int quantidadeMinimaCreditos;

	private ArrayList<Turma> turmas = new ArrayList<Turma>();
	
	public Disciplina(String codigo, String nome, int cargaHoraria, int qtdCreditos, int qtdMinCreditos) {
		this.codigoDisciplina = codigo;
		this.nomeDisciplina = nome;
		this.cargaHorariaDisciplina = cargaHoraria;
		this.quantidadeCreditos = qtdCreditos;
		this.quantidadeMinimaCreditos = qtdMinCreditos;
	}
	
	public String adicionaTurmaGraduacao(int semestre, int ano) {
		cod++;
		try {
			turmas.add(new TurmaGraduacao(cod, semestre, ano));
			return SystemMessages.DISCIPLINA_TURMA_GRADUACAO_ADICIONADA_SUCESSO.getMessage();
		} catch(Exception ex) {
			return SystemMessages.ERRO_INTERNO.getMessage();
		}
	}
	
	public String adicionaTurmaExtensao(Date dataIni, Date dataFim) {
		cod++;
		try {
			turmas.add(new TurmaExtensao(cod, dataIni, dataFim));
			return SystemMessages.DISCIPLINA_TURMA_EXTENSAO_ADICIONADA_SUCESSO.getMessage();
		} catch(Exception ex) {
			return SystemMessages.ERRO_INTERNO.getMessage();
		}
	}
	
	public String removeTurma(int codigo) {
		try {
			int i = 0;
			boolean encontrado = false;
			
			for(Turma t : turmas) {
				if(t.getCodigoSequenciaTurma() == codigo) encontrado = true;
				i++;
			}
			
			if(encontrado) {
				turmas.remove(turmas.get(i));
			}
			return SystemMessages.DISCIPLINA_TURMA_REMOVIDA.getMessage();
			
		} catch(Exception ex) {
			return SystemMessages.DISCIPLINA_TURMA_NÃO_ENCONTRADA.getMessage();
		}
	}
	
	public String verificaTurma(int codTurma) {
		try {
			for(Turma t : turmas) {
				if(t.getCodigoSequenciaTurma() == codTurma)
					return "Codigo da turma: " + codTurma;
			}
		} catch(Exception ex) {
			return SystemMessages.DISCIPLINA_TURMA_NÃO_ENCONTRADA.getMessage();
		}
		return "Codigo procurado: " + codTurma;
	}

	public String getCodigoDisciplina() {
		return codigoDisciplina;
	}

	public void setCodigoDisciplina(String codigoDiciplina) {
		this.codigoDisciplina = codigoDiciplina;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDiciplina) {
		this.nomeDisciplina = nomeDiciplina;
	}

	public int getCargaHorariaDisciplina() {
		return cargaHorariaDisciplina;
	}

	public void setCargaHorariaDisciplina(int cargaHorariaDiciplina) {
		this.cargaHorariaDisciplina = cargaHorariaDiciplina;
	}

	public int getQuantidadeCreditos() {
		return quantidadeCreditos;
	}

	public void setQuantidadeCreditos(int quantidadeCreditos) {
		this.quantidadeCreditos = quantidadeCreditos;
	}

	public int getQuantidadeMinimaCreditos() {
		return quantidadeMinimaCreditos;
	}

	public void setQuantidadeMinimaCreditos(int quantidadeMinimaCreditos) {
		this.quantidadeMinimaCreditos = quantidadeMinimaCreditos;
	}
	
	public ArrayList<Turma> getTurmas() {
		return turmas;
	}
}
