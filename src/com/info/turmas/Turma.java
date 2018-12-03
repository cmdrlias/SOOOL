package com.info.turmas;

import java.util.ArrayList;

import com.config.SystemMessages;
import com.info.discente.Aluno;

public abstract class Turma {
	private int codigoSequenciaTurma;
	
	protected ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	public Turma(int codSequencia) {
		this.codigoSequenciaTurma = codSequencia;
	}
	
	public String adicionaAluno(Aluno a) {
		try {
			alunos.add(a);
			return SystemMessages.TURMA_ALUNO_ADICIONADO_SUCESSO.getMessage();
		} catch(Exception ex) {
			return SystemMessages.ERRO_INTERNO.getMessage();
		}
	}
	
	public String removeAluno(String matricula) {
		try {
			int i = 0;
			boolean encontrado = false;
			
			for(Aluno a : alunos) {
				if(a.getMatriculaAluno().equalsIgnoreCase(matricula)) encontrado = true;
				i++;
			}
			
			if(encontrado) {
				alunos.remove(alunos.get(i));
			}
			return SystemMessages.TURMA_ALUNO_REMOVIDO.getMessage();
			
		} catch(Exception ex) {
			return SystemMessages.TURMA_ALUNO_NAO_ENCONTRADO.getMessage();
		}
	}
	
	//TODO 
	// uma turma deve ter no mínimo cinco alunos.
	// Se a turma não tiver pelo menos 5 alunos, uma exceção da Classe Exceção, declarada abaixo,
	// deve ser disparada. Um número de erro para essa situação deve ser especificado, assim com sua
	// mensagem. A classe cliente que tiver que tratar essa exceção deve exigir inclusões de Alunos
	// necessárias para se chegar a esse número. A forma para se resolver isso deve ser proposta pelo
	// trabalho.

	public int getCodigoSequenciaTurma() {
		return codigoSequenciaTurma;
	}

	public void setCodigoSequenciaTurma(int codigoSequenciaTurma) {
		this.codigoSequenciaTurma = codigoSequenciaTurma;
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
}
