package com.sistema.exceptions;

public class Exception {
	private int idException;
	private String mensagemException;
	
	public Exception(int id, String mensagem) {
		this.idException = id;
		this.mensagemException = mensagem;
	}

	public int getIdException() {
		return idException;
	}

	public void setIdException(int idException) {
		this.idException = idException;
	}

	public String getMensagemException() {
		return mensagemException;
	}

	public void setMensagemException(String mensagemException) {
		this.mensagemException = mensagemException;
	}
}
