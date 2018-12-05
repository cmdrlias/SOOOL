package com.academico.turmas;

public class Aula {
	private int idAula;
	private String diaSemanaAula;
	private String horaInicioAula;
	private String horaFimAula;
	
	public Turma turma;
	public Disciplina diciplina;
	
	public Aula(String diaSemana, String horaInicio, String horaFim, Turma turma, Disciplina disciplina) {
		this.diaSemanaAula = diaSemana;
		this.horaInicioAula = horaInicio;
		this.horaFimAula = horaFim;
		
		this.turma = turma;
		this.diciplina = disciplina;
	}
	
	// TODO
	// Regra de negócio sob exceção (Fazer na Etapa 3): uma mesma turma não pode ter mais de uma
	// disciplina no mesmo dia da semana e horários iguais. Se isso ocorrer, deve ser disparada a
	// exceção da classe Exceção, impossibilitando a criação daquele horário de aula. Um número de erro
	// e a respectiva mensagem devem ser especificados.

	public String getDiaSemanaAula() {
		return diaSemanaAula;
	}

	public void setDiaSemanaAula(String diaSemanaAula) {
		this.diaSemanaAula = diaSemanaAula;
	}

	public String getHoraInicioAula() {
		return horaInicioAula;
	}

	public void setHoraInicioAula(String horaInicioAula) {
		this.horaInicioAula = horaInicioAula;
	}

	public String getHoraFimAula() {
		return horaFimAula;
	}

	public void setHoraFimAula(String horaFimAula) {
		this.horaFimAula = horaFimAula;
	}

	public int getIdAula() {
		return idAula;
	}

	public void setIdAula(int idAula) {
		this.idAula = idAula;
	}
}
