package agrupandoCollectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Escola {
	private String nome, CNPJ;
	private Endereco endereco;
	private List<Departamento> departamentos;
	private List<Aluno> discentes;
	
	public Escola(String nome, String CNPJ) {
		this.nome = nome;
		this.CNPJ = CNPJ;
		this.departamentos = new ArrayList<>();
		this.discentes = new ArrayList<>();
	}
	
	public void criarDepartamento(Departamento nomeDepartamento) {
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
		Map<String, List<Aluno>> agrupador = discentes.stream().collect(Collectors.groupingBy(Aluno::getNaturalidade));
		agrupador.forEach((String chave, List<Aluno> lista) -> System.out.println(chave + " = " + lista));
	}
}
