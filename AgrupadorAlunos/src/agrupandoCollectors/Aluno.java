package agrupandoCollectors;

public class Aluno {
	private String nome, matricula, naturalidade;
	
	public Aluno(String nome, String naturalidade) {
		this.nome = nome;
		this.naturalidade = naturalidade;
	}
	
	public String getNaturalidade() {
		return this.naturalidade;
	}
	
	// @Override indica que estou fazendo uma sobrecarga (sobrescrevendo) na string na classe Aluno
	@Override 
	public String toString() {
		// Retorna uma string com a formatação "aluno(naturalidade)"
		return String.format("%s(%s)",nome, naturalidade);
	}
}