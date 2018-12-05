package com.academico.docente;

import java.util.ArrayList;

import com.academico.cursos.Curso;
import com.academico.instituicao.Instituto;
import com.sistema.config.SystemMessages;

public class Coordenador extends Professor {
	private int cargaHorariaCoordenador;
	private double bonusCoordenador;
	
	private ArrayList<Instituto> institutos = new ArrayList<Instituto>();
	private ArrayList<Curso> cursos = new ArrayList<Curso>();
	
	public Coordenador(String nome, String titulacao, String cpf, int cargaHoraria, double bonus) {
		super(nome, titulacao, cpf);
		this.cargaHorariaCoordenador = cargaHoraria;
		this.bonusCoordenador = bonus;
	}
	
	public String adicionaInstituto(Instituto instituto) {
		try {
			institutos.add(instituto);
			return SystemMessages.COORDENADOR_INSTITUTO_ADICIONADO_SUCESSO.getMessage();
		} catch(Exception ex) {
			return SystemMessages.ERRO_INTERNO.getMessage();
		}
	}
	
	public String adicionaCurso(Curso curso) {
		try {
			cursos.add(curso);
			return SystemMessages.COORDENADOR_CURSO_ADICIONADO_SUCESSO.getMessage();
		} catch(Exception ex) {
			return SystemMessages.ERRO_INTERNO.getMessage();
		}
	}
	
	public ArrayList<Curso> listaCursosNoite() {
		ArrayList<Curso> turnoNoite = new ArrayList<Curso>();
		for(Curso c : cursos) {
			if(c.getTurnoCurso().equalsIgnoreCase("NOITE")) {
				turnoNoite.add(c);
			}
		}
		return turnoNoite;
	}
	
	// TODO
	// Regra de negócio sob exceção (Fazer na Etapa 3): um professor não pode ter uma quantidade de
	// aulas, cuja carga horária de disciplinas a lecionar seja maior que a sua carga horária como
	// coordenador. Se isso ocorrer, deve ser disparada a exceção da classe Exceção, impossibilitando a
	// alocação daquele horário de aula, se já for coordenador, ou impedido o cadastro como coordenador,
	// se possuir tantas aulas. Um número de erro e a respectiva mensagem devem ser especificados.

	public int getCargaHorariaCoordenador() {
		return cargaHorariaCoordenador;
	}

	public void setCargaHorariaCoordenador(int cargaHorariaCoordenador) {
		this.cargaHorariaCoordenador = cargaHorariaCoordenador;
	}

	public double getBonusCoordenador() {
		return bonusCoordenador;
	}

	public void setBonusCoordenador(double bonusCoordenador) {
		this.bonusCoordenador = bonusCoordenador;
	}
}