package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class Testedelistas {

	public static void main(String[] args) {
		String aula1 = "Construção de listas";
		String aula2 = "Modelndo e classes aula";
		String aula3 = "Trabalhando com cursos de Sets";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas.toString());
		
		aulas.remove(0);
		System.out.println(aulas.toString());
		
		for(String aula: aulas) {
			System.out.println("Aula: "+aula);
		}
		
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é :"+ primeiraAula);
		
		
		aulas.forEach(aula -> {
			System.out.println("percorrendo: ");
			System.out.println("AULA "+ aula);
			
		});
		aulas.add("Aumentando o nosso conhecimento");
		Collections.sort(aulas);
		System.out.println("Ordenado");
		System.out.println(aulas);
		
	}

}
