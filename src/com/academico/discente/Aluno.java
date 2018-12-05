package com.academico.discente;

public class Aluno {
	private String matriculaAluno;
	private String nomeAluno;
	private String enderecoAluno;
	
	public Aluno(String matricula, String nome, String endereco) {
		this.matriculaAluno = matricula;
		this.nomeAluno = nome;
		this.enderecoAluno = endereco;
	}

	public String getMatriculaAluno() {
		return matriculaAluno;
	}

	public void setMatriculaAluno(String matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getEnderecoAluno() {
		return enderecoAluno;
	}

	public void setEnderecoAluno(String enderecoAluno) {
		this.enderecoAluno = enderecoAluno;
	}
}
