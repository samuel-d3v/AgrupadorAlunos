package agrupandoCollectors;

import java.util.Calendar;
import java.util.UUID;

public class Diretor extends Funcionario {
	
	public Diretor(String name, Calendar dataNascimento, String CPF, Endereco endereco) {
		super(name, dataNascimento, CPF, endereco);
		gerarMatricula();
	}
	
	protected void gerarMatricula() {
		matricula = "E-" + UUID.randomUUID().toString();
	}
	
	protected void alterarMatricula(String matricula) {
		this.matricula = matricula;
	}
}