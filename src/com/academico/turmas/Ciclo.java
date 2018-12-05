package com.academico.turmas;

import java.util.ArrayList;

import com.sistema.config.SystemMessages;

public class Ciclo {
	private String descricaoTemaCiclo;
	
	private ArrayList<Modulo> modulos = new ArrayList<Modulo>();
	
	public Ciclo(String descTema) {
		this.descricaoTemaCiclo = descTema;
	}
	
	public String verificaModulo(String codModulo) {
		try {
			for(Modulo m : modulos) {
				if(m.getCodigoModulo().equalsIgnoreCase(codModulo))
					return codModulo;
			}
		} catch(Exception ex) {
			return SystemMessages.CICLO_MODULO_NAO_ENCONTRADO.getMessage();
		}
		return codModulo;
	}
	
	public String adicionaModulo(String codModulo, int qtdCreditos) {
		try {
			this.modulos.add(new Modulo(codModulo, qtdCreditos));
			return SystemMessages.CICLO_MODULO_ADICIONADO.getMessage();
		} catch(Exception ex) {
			return SystemMessages.ERRO_INTERNO.getMessage();
		}
	}
	
	public String removeModulo(String codModulo) {
		try {
			int i = 0;
			boolean encontrado = false;
			
			for(Modulo m : modulos) {
				if(m.getCodigoModulo().equalsIgnoreCase(codModulo)) encontrado = true;
				i++;
			}
			
			if(encontrado) {
				modulos.remove(modulos.get(i));
			}
			return SystemMessages.CICLO_MODULO_REMOVIDO.getMessage();
			
		} catch(Exception ex) {
			return SystemMessages.CICLO_MODULO_NAO_ENCONTRADO.getMessage();
		}
	}

	public String getDescricaoTemaCiclo() {
		return descricaoTemaCiclo;
	}

	public void setDescricaoTemaCiclo(String descricaoTemaCiclo) {
		this.descricaoTemaCiclo = descricaoTemaCiclo;
	}
}
