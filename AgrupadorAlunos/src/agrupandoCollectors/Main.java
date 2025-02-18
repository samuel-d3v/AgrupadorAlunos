package agrupandoCollectors;

import agrupandoCollectors.Aluno;
import agrupandoCollectors.Escola;

public class Main {
	private static Aluno aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7, aluno8, aluno9;
	private static Escola escola;
	
	public static void main(String[] args) {
		escola = new Escola("Escola Manoel Joaquim", "01.234.567-89");
		criarAlunos();
		matricularAlunos();
		escola.agruparAlunos();
	}
	
	private static void criarAlunos() {
		aluno1 = new Aluno("Jão", "SP");
		aluno2 = new Aluno("Predo", "RJ");
		aluno3 = new Aluno("Samuel", "RN");
		aluno4 = new Aluno("Zé", "MG");
		aluno5 = new Aluno("Lolita", "RN");
		aluno6 = new Aluno("Oto", "SP");
		aluno7 = new Aluno("Valeria", "RN");
		aluno8 = new Aluno("Tatu", "CE");
		aluno9 = new Aluno("Peba", "MG");
	}
	
	private static void matricularAlunos() {
		escola.matricularAluno(aluno1);
		escola.matricularAluno(aluno2);
		escola.matricularAluno(aluno3);
		escola.matricularAluno(aluno4);
		escola.matricularAluno(aluno5);
		escola.matricularAluno(aluno6);
		escola.matricularAluno(aluno7);
		escola.matricularAluno(aluno8);
		escola.matricularAluno(aluno9);
	}

}