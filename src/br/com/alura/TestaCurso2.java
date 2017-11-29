package br.com.alura;

import java.util.ArrayList;
import java.util.List;

public class TestaCurso2 {
	
	public static void main(String [] args) {
		Curso curso = new Curso("Testando novas funçoes", "Gabriel");
		
		curso.adiciona(new Aula ("Teste de função 1", 15));
		curso.adiciona(new Aula ("Teste de função 2", 15));
		curso.adiciona(new Aula ("Teste de função 3", 15));
		curso.adiciona(new Aula ("Teste de função 4", 15));
		
		System.out.println(curso.getAulas()); 
		List<Aula> aulas = new ArrayList<Aula>(curso.getAulas());
		
		System.out.println(aulas);
		
		System.out.println("Tempo total de Curso: "+ curso.getTempoTotal());
		
		System.out.println(curso);
		
		
	}

}
