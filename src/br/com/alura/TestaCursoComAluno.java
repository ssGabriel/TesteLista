package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {
	
	public static void main(String[] args) {
	
	Curso curso = new Curso("Testando novas funçoes", "Gabriel");
	
	curso.adiciona(new Aula ("Teste de função 1", 15));
	curso.adiciona(new Aula ("Teste de função 2", 15));
	curso.adiciona(new Aula ("Teste de função 3", 15));
	curso.adiciona(new Aula ("Teste de função 4", 15));
	
	Aluno a1 = new Aluno("Gabriel", 12156115);
	Aluno a2 = new Aluno("Rafael", 12651656);
	Aluno a3 = new Aluno("Miguel", 18948454);
	Aluno a4 = new Aluno("Azequiel", 12841136);
	
	curso.matriculaAluno(a1);
	curso.matriculaAluno(a2);
	curso.matriculaAluno(a3);
	curso.matriculaAluno(a4);
	
	System.out.println("Todos os alunos matriculados: ");
	curso.getAluno().forEach(a -> {
		System.out.println(a);
	});
	
	System.out.println("O aluno "+a1+" esta matriculado:"+curso.estaMatriculado(a1));
	
	System.out.println(curso.estaMatriculado(a1));
	
	Aluno gabriel = new Aluno("Gabriel", 12156115);
	System.out.println("Esse aluno esta matriculado?");
	System.out.println(curso.estaMatriculado(gabriel));
	
	// obricgatoriamente o seguinte é true;
	
	System.out.println(a1.hashCode() == gabriel.hashCode());
	
	Set<Aluno> alunos = curso.getAluno();
	Iterator<Aluno> iterador = alunos.iterator();
	iterador.hasNext();
	while(iterador.hasNext()) {
		Aluno proximo = iterador.next();
		System.out.println(proximo);
	}
	
	Aluno depoisDoUltimo = iterador.next();
	 
	
	for(Aluno a : curso.getAluno()) {
		System.out.println(a);
	}
	
	

	
	
	}
}
