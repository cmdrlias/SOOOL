package com.info.instituicao;

import java.util.ArrayList;

import com.config.SystemMessages;

public class Campus {
	private String nomeCampus;
	private int quantidadeBlocos;
	
	private ArrayList<Instituto> institutos = new ArrayList<Instituto>();
	
	public Campus(String nome, int qtdBlocos) {
		this.nomeCampus = nome;
		this.quantidadeBlocos = qtdBlocos;
	}
	
	public String adicionaInstituto(Instituto instituto) {
		try {
			institutos.add(instituto);
			return SystemMessages.CAMPUS_INSTITUTO_ADICIONADO_SUCESSO.getMessage();
		} catch(Exception ex) {
			return SystemMessages.ERRO_INTERNO.getMessage();
		}
	}
	
	public String getNomeCampus() {
		return nomeCampus;
	}
	public void setNomeCampus(String nomeCampus) {
		this.nomeCampus = nomeCampus;
	}
	public int getQuantidadeBlocos() {
		return quantidadeBlocos;
	}
	public void setQuantidadeBlocos(int quantidadeBlocos) {
		this.quantidadeBlocos = quantidadeBlocos;
	}
	
	
}
