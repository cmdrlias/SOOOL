package com.academico.turmas;

import java.util.ArrayList;

import com.sistema.config.SystemMessages;

public class Modulo {
	private String codigoModulo;
	private int quantidadeCreditosModulo;
	
	private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public Modulo(String codigoModulo, int qtdCreditos) {
		this.codigoModulo = codigoModulo;
		this.quantidadeCreditosModulo = qtdCreditos;
	}
	
	public String adicionarDisciplina(String codigo, String nome, int cargaHoraria, int qtdCreditos, int qtdMinCreditos) {
		try {
			disciplinas.add(new Disciplina(codigo, nome, cargaHoraria, qtdCreditos, qtdMinCreditos));
			return SystemMessages.MODULO_DISCIPLINA_ADICIONADA_SUCESSO.getMessage();
		} catch(Exception ex) {
			return SystemMessages.ERRO_INTERNO.getMessage();
		}
	}
	
	public String removeDiciplina(String codigo) {
		try {
			int i = 0;
			boolean encontrado = false;
			
			for(Disciplina d : disciplinas) {
				if(d.getCodigoDisciplina().equalsIgnoreCase(codigo)) encontrado = true;
				i++;
			}
			
			if(encontrado) {
				disciplinas.remove(disciplinas.get(i));
			}
			return SystemMessages.MODULO_DISCIPLINA_REMOVIDA.getMessage();
			
		} catch(Exception ex) {
			return SystemMessages.MODULO_DISCIPLINA_NAO_ENCONTRADA.getMessage();
		}
	}
	
	public String pesquisaDiciplina(String nome) {
		try {
			for(Disciplina d : disciplinas) {
				if(d.getNomeDisciplina().equalsIgnoreCase(nome)) {
					return d.getCodigoDisciplina();
				} else {
					return SystemMessages.MODULO_DISCIPLINA_NAO_ENCONTRADA.getMessage();
				}
			}
			return nome;
			
		} catch(Exception ex) {
			return SystemMessages.ERRO_INTERNO.getMessage();
		}
	}
	
	public String getCodigoModulo() {
		return codigoModulo;
	}

	public void setCodigoModulo(String codigoModulo) {
		this.codigoModulo = codigoModulo;
	}

	public int getQuantidadeCreditosModulo() {
		return quantidadeCreditosModulo;
	}

	public void setQuantidadeCreditosModulo(int quantidadeCreditosModulo) {
		this.quantidadeCreditosModulo = quantidadeCreditosModulo;
	}

	public ArrayList<Disciplina> getDiciplinas() {
		return disciplinas;
	}
}
