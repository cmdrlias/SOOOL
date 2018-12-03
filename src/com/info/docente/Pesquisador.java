package com.info.docente;

import java.util.ArrayList;

import com.config.SystemMessages;
import com.info.cursos.Projeto;

public class Pesquisador extends Professor {
	private int cargaHorariaPesquisador;
	
	private ArrayList<Projeto> projetos = new ArrayList<Projeto>();
	
	public Pesquisador(String nome, String titulacao, String cpf, int cargaHoraria) {
		super(nome, titulacao, cpf);
		this.cargaHorariaPesquisador = cargaHoraria;
	}
	
	public String adicionaProjeto(Projeto projeto) {
		try {
			projetos.add(projeto);
			return SystemMessages.PESQUISADOR_PROJETO_ADICIONADO_SUCESSO.getMessage();
		} catch(Exception ex) {
			return SystemMessages.ERRO_INTERNO.getMessage();
		}
	}
	
	public String verificaProjeto(String nome) {
		try {
			for(Projeto p : projetos) {
				if(p.getNomeProjeto().equalsIgnoreCase(nome))
					return nome;
			}
		} catch(Exception ex) {
			return SystemMessages.CICLO_MODULO_NAO_ENCONTRADO.getMessage();
		}
		return nome;
	}

	public int getCargaHorariaPesquisador() {
		return cargaHorariaPesquisador;
	}

	public void setCargaHorariaPesquisador(int cargaHorariaPesquisador) {
		this.cargaHorariaPesquisador = cargaHorariaPesquisador;
	}
}