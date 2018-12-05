package com.sistema.config;

public enum SystemMessages {
	// TODO lista de mensagens do sistema. Adicionar de acordo com a necessidade de uso.
	ERRO_INTERNO("Erro interno do sistema. Tente novamente"),
	//CICLO
	CICLO_MODULO_ADICIONADO("Modulo adicionado à ciclo com sucesso!"),
	CICLO_MODULO_REMOVIDO("Modulo removido de ciclo com sucesso!"),
	CICLO_MODULO_NAO_ENCONTRADO("Módulo não encontrado."),
	//MODULO
	MODULO_DISCIPLINA_ADICIONADA_SUCESSO("Disciplina adicionada à módulo com sucesso!"),
	MODULO_DISCIPLINA_REMOVIDA("Disciplina removida de módulo com sucesso!"),
	MODULO_DISCIPLINA_NAO_ENCONTRADA("Disciplina não encontrada."),
	//DISCIPLINA
	DISCIPLINA_TURMA_GRADUACAO_ADICIONADA_SUCESSO("Turma de graduação adicionada à disciplina com sucesso!"),
	DISCIPLINA_TURMA_EXTENSAO_ADICIONADA_SUCESSO("Turma de extensão adicionada à disciplina com sucesso!"),
	DISCIPLINA_TURMA_REMOVIDA("Turma removida da disciplina com sucesso!"),
	DISCIPLINA_TURMA_NÃO_ENCONTRADA("Turma não encontrada."),
	//TURMA
	TURMA_ALUNO_ADICIONADO_SUCESSO("Aluno adicionado à turma com sucesso!"),
	TURMA_ALUNO_REMOVIDO("Aluno removido da turma com sucesso!"),
	TURMA_ALUNO_NAO_ENCONTRADO("Aluno não encontrado."),
	//PROFESSOR
	PROFESSOR_AULA_ADICIONADA_SUCESSO("Aula adicionada para professor com sucesso!"),
	//PESQUISADOR
	PESQUISADOR_PROJETO_ADICIONADO_SUCESSO("Projeto adicionado para pesquisador com sucesso!"),
	PESQUISADOR_PROJETO_NAO_ENCONTRADO("Projeto não encontrado."),
	//PROJETO
	PROJETO_CURSO_ADICIONADO_SUCESSO("Curso adicionado à projeto com sucesso!"),
	//COORDENADOR
	COORDENADOR_INSTITUTO_ADICIONADO_SUCESSO("Instituto adicionado para coordenador com sucesso!"),
	COORDENADOR_CURSO_ADICIONADO_SUCESSO("Curso adicionado para coordenador com sucesso!"),
	//INSTITUTO
	INSTITUTO_COORDENADOR_ADICIONADO_SUCESSO("Coordenador adicionado à instituto com sucesso!"),
	//CAMPUS
	CAMPUS_INSTITUTO_ADICIONADO_SUCESSO("Instituto adicionado à campus com sucesso!"),
	//INSTITUICAO
	INSTITUICAO_CAMPUS_ADICIONADO_SUCESSO("Campus adicionado à instituição com sucesso!"),
	INSTITUICAO_CURSO_ADICIONADO_SUCESSO("Curso adicionado à instituição com sucesso!")
	;
	
	private String message;
	
	SystemMessages(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}
