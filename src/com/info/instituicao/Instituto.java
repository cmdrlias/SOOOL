package com.info.instituicao;

import java.util.ArrayList;

import com.config.SystemMessages;
import com.info.docente.Coordenador;
import com.info.docente.Professor;

public class Instituto {
	private String siglaInstituto;
	private String nomeInstituto;
	
	private ArrayList<Professor> coordenadores = new ArrayList<Professor>();
	
	public Instituto(String sigla, String nome) {
		this.siglaInstituto = sigla;
		this.nomeInstituto = nome;
	}
	
	public String adicionaCoordenador(String nome, String titulacao, String cpf, int cargaHoraria, double bonus) {
		try {
			Professor p = new Coordenador(nome, titulacao, cpf, cargaHoraria, bonus);
			coordenadores.add(p);
			return SystemMessages.INSTITUTO_COORDENADOR_ADICIONADO_SUCESSO.getMessage();
		} catch(Exception ex) {
			return SystemMessages.ERRO_INTERNO.getMessage();
		}
	}

	public String getSiglaInstituto() {
		return siglaInstituto;
	}

	public void setSiglaInstituto(String siglaInstituto) {
		this.siglaInstituto = siglaInstituto;
	}

	public String getNomeInstituto() {
		return nomeInstituto;
	}

	public void setNomeInstituto(String nomeInstituto) {
		this.nomeInstituto = nomeInstituto;
	}

	public ArrayList<Professor> getCoordenadores() {
		return coordenadores;
	}
}
