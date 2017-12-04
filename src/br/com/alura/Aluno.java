package br.com.alura;

public class Aluno {
	
	
	private String nome;
	private int cpf;
	private int numeroMatricula;
	
	public Aluno (String nome, int numero) {
		if (nome==null) {
			throw new NullPointerException("Nome não pode ser null");
		}
		this.numeroMatricula = numero;
		this.nome = nome;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	
	@Override
	public String toString() {
	return "Aluno: "+nome+", matricula: "+ this.numeroMatricula;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return this.nome.equals(outro.nome) && outro.numeroMatricula==this.numeroMatricula;
		
	}
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
	
	
	

}


