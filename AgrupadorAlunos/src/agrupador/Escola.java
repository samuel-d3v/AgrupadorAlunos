package agrupador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Escola {
	// Atributos (Caracteristicas)
	private String nome, CNPJ;
	private Endereco endereco;
	private List<Departamento> departamentos;
		private List<Aluno> discentes;
	
	// Métodos (Comportamento)
	public Escola(String nome, String CNPJ) {
		this.nome = nome;
		this.CNPJ = CNPJ;
		this.departamentos = new ArrayList<Departamento>();
		this.discentes = new ArrayList<Aluno>();
	}
	
	public void criarDepartamento(String nomeDepartamento) {
		departamentos.add(new Departamento(nomeDepartamento));
	}
	
	public void fecharDepartamento(Departamento departamento) {
		departamentos.remove(departamento);
	}
		
	public void matricularAluno(Aluno novoAluno) {
		discentes.add(novoAluno);
	}
	
	public void trancarMatricula(Aluno aluno) {
		discentes.remove(aluno);
	}
	
	public void agruparAlunos() {
		Map<String, List<Aluno>> agrupamento = new HashMap<>();
		for (Aluno aluno : discentes) {
			if(!agrupamento.containsKey(aluno.getNaturalidade())) {
				agrupamento.put(aluno.getNaturalidade(), new ArrayList<Aluno>());
			}
			
			agrupamento.get(aluno.getNaturalidade()).add(aluno);
		}
		
		System.out.println("Resultado do agrupamento por naturalidade: " + agrupamento);
	}
}	
