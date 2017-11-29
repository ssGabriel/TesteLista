package br.com.alura;

import java.util.HashSet;
import java.util.Set;
public class TeslaAluno {
	
	public static void main(String[] args) {
		
	
	
	Set<String> alunos = new HashSet<>();
	alunos.add("Gabriel Santos");
	alunos.add("Gabriel Cassandri");
	alunos.add("Gabriel Gaida");
	alunos.add("Diego Alencar");
	alunos.add("Thiago Silva");
	alunos.add("Vinicius Dias");
	alunos.add("Fernando Cyrot");
	
	for(String aluno : alunos) {
		System.out.println(aluno);
	}
	
	
	

	}
}

