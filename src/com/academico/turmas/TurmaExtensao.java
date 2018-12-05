package com.academico.turmas;

import java.util.Date;

import com.academico.discente.Aluno;
import com.sistema.config.SystemMessages;

public class TurmaExtensao extends Turma {
	private Date dataInicio;
	private Date dataFim;
	
	public TurmaExtensao(int codSequencia, Date dataIni, Date dataFim) {
		super(codSequencia);
		this.dataInicio = dataIni;
		this.dataFim = dataFim;
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
	// dataFim deve ser maior que data dataInicio.
	// Estas datas também devem ser datas válidas, inclusive para anos bissextos. Caso essas duas
	// situações não sejam respeitadas na aplicação, devem ser disparadas exceções da Classe Exceção
	// abaixo. Um número de erro para cada uma dessas situações deve ser especificado, assim como
	// suas mensagens.

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
}
