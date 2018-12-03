package com.info.cursos;

public class CursoGraduacao extends Curso {
	public CursoGraduacao(String codigo, String nome, String turno) {
		super(codigo, nome, turno);
	}
	
	// TODO
	// Método para pesquisar se um Período, no caso de curso de graduação, já foi adicionado na Lista de
	// Ciclos. Parâmetros: número para busca por período. O retorno é o objeto procurado. Observe que o
	// ArrayList listaCiclo deve ser acessada diretamente por este método.
	
	public void alterarTurno(String turno) {
		setTurnoCurso(turno);
	}
}