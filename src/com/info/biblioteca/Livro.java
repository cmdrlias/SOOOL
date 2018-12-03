package com.info.biblioteca;

public class Livro {
	private String tituloLivro;
	private String quantidadeLivro;
	
	public Livro(String titulo, String qtdLivro) {
		this.tituloLivro = titulo;
		this.quantidadeLivro = qtdLivro;
	}
	
	// TODO
	// toda vez que um livro for emprestado, a
	// quantidade de exemplares deve ser decrementada e, quando ocorrer uma devolução, esse atributo
	// deve ser incrementado. Um livro só pode ser emprestado se a quantidade de exemplares for maior
	// que zero. Caso contrário, deve ser disparada a exceção da classe Exceção, impossibilitando o
	// empréstimo. Um número de erro e a respectiva mensagem devem ser especificados.

	public String getTituloLivro() {
		return tituloLivro;
	}

	public void setTituloLivro(String tituloLivro) {
		this.tituloLivro = tituloLivro;
	}

	public String getQuantidadeLivro() {
		return quantidadeLivro;
	}

	public void setQuantidadeLivro(String quantidadeLivro) {
		this.quantidadeLivro = quantidadeLivro;
	}
}
