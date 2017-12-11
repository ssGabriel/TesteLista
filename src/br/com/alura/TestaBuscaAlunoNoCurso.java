package br.com.alura;

public class TestaBuscaAlunoNoCurso {

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
		
		
		System.out.println("Quem é aluno com matricula ?");
		Aluno aluno = curso.buscaMatricula(1006115);
		System.out.println("Aluno: "+ aluno);

	}

}
