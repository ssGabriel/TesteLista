package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestedeAula {

	public static void main(String[] args) {
		Aula a1 = new Aula("Revisantdo Array",10);
		Aula a2 = new Aula("Lista de Objetos",15);
		Aula a3 = new Aula("Comandos Principais",12);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas.toString());
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		Collections.sort(aulas,java.util.Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
	}

}
