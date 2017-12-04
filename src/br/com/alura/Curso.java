package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Curso {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	
	
	
	
	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	
	public void adicionaAula (Aula aula) {
		this.aulas.add(aula);
	}

	public Curso(String nome, String instrutor){
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
		int tempoTotal=0;
		for (Aula aula:aulas) {
				tempoTotal += aula.getTempo();
			}
				return tempoTotal;
		}
	
		public String toString() {
			return "[Curso:"+nome+", tempo total: "+ 
		this.getTempoTotal()+ "," +" aulas: "
					+this.aulas.toString()+"]";
		}
		
		public void matriculaAluno(Aluno a) {
			this.alunos.add(a);
		}
		
		public Set<Aluno> getAluno(){
			return Collections.unmodifiableSet(alunos);
		}

		public boolean estaMatriculado(Aluno a1) {
			return this.alunos.contains(a1);
		}
	}
	
	


