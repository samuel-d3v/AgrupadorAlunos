package agrupandoCollectors;

import java.util.Calendar;
import java.util.Random;

public class Funcionario extends Pessoa{
	protected String matricula;
	private Calendar dataDemissao, dataAdmissao;
	
	public Funcionario(String name, Calendar dataNascimento, String CPF, Endereco endereco) {
		super(name, dataNascimento, CPF, endereco);
		gerarMatricula();
		dataAdmissao = Calendar.getInstance();
	}
	
	public void demitirFuncionario() {
		dataDemissao = Calendar.getInstance();
	}
	
	public Calendar getDataDemissao() {
		return this.dataDemissao;
	}
	
	protected void gerarMatricula() {
		this.matricula = "Matricula não definida";
	}
	
	protected String recuperarMatricula() {
		return this.matricula;
	}
	
	protected void alterarMatricula(String matricula) {
		this.matricula = matricula;
	}
	
}
