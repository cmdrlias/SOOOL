package com.academico.cursos;

public class CursoExtensao extends Curso {
	private int cargaHoraria;
	
	public CursoExtensao(String codigo, String nome, String turno, int cargaHoraria) {
		super(codigo, nome, turno);
		this.cargaHoraria = cargaHoraria;
	}
	
	// TODO 
	// Método para pesquisar se uma Turma (curso de extensão) já foi adicionado em listaExtensaoCiclo.
	// Parâmetros: nome do curso por turma de extensão. O retorno é o objeto procurado.
	
	public void alterarTurno(String turno) {
		setTurnoCurso(turno);
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
}