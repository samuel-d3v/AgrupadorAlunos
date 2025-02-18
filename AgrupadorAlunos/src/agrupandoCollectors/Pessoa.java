package agrupandoCollectors;

import java.util.Calendar;

public class Pessoa {
	private String name;
	private int age;
	private Calendar dataNascimento;
	private String CPF;
	private Endereco endereco;
	
	public Pessoa (String name, Calendar dataNascimento, String CPF, Endereco endereco) {
		this.name = name;
		this.dataNascimento = dataNascimento;
		this.CPF = CPF;
		this.endereco = endereco;
		this.age = calculateAge();
	}
	
	protected void updateName(String name) {
		this.name = name;
	}
	
	protected String recoverName() {
		return this.name;
	}

	protected int recoverAge() {
		return this.age;
	}
	
	protected void updateCPF(String CPF) {
		this.CPF = CPF;
	}
	
	protected String recoverCPF() {
		return this.CPF;
	}
	
	protected void updateAddress(Endereco address) {
		this.endereco = address;
	}
	
	protected Endereco recoverAddress() {
		return this.endereco;
	}	
	
	private int calculateAge() {
		int  lapso;
		Calendar hoje = Calendar.getInstance();
		lapso = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);
		if(dataNascimento.get(Calendar.MONTH) > hoje.get(Calendar.MONTH) || dataNascimento.get(Calendar.MONTH) == hoje.get(Calendar.DAY_OF_MONTH) && dataNascimento.get(Calendar.DAY_OF_MONTH) > hoje.get(Calendar.DAY_OF_MONTH)) {
			lapso--;
		}
		
		return lapso;
	}
}