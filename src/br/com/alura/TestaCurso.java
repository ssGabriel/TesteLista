package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando As colecoes java",
				"Gabriel");
		
		List<Aula> aulas = javaColecoes.getAulas();
		
		System.out.println(aulas);
		
		aulas.add(new Aula("Trabalhando com Arraylist",21));
		
		javaColecoes.adiciona(new Aula ("Trabalhando com Strings",30));
		
		System.out.println(aulas);
		
		
	}

}
