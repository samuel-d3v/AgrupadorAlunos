package agrupandoCollectors;

public class Endereco {
	private String pais;
	private String uf;
	private String cidade;
	private String rua;
	private String numero;
	private int cep;
	private String complemento;
	
	protected void setPais(String pais) {
		this.pais = pais;
	}
	
	public String getPais() {
		return this.pais;
	}
	
	protected void setUF(String uf) {
		this.uf = uf;
	}
	
	public String getUF() {
		return this.uf;
	}
	
	protected void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getCidade() {
		return this.cidade;
	}
	
	protected void setRua(String rua) {
		this.rua = rua;
	}
	
	public String getRua() {
		return this.rua;
	}
	
	protected void setNunero(String numero) {
		this.numero = numero;
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	protected void setCEP(int cep) {
		this.cep = cep;
	}	
	
	public int getCEP() {
		return this.cep;
	}
	
	protected void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public String getComplemento() {
		return this.complemento;
	}
}