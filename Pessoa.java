package Parte3_14b;

/**
 * Aprendizado:
 * 	1) Fazendo uma classe abstrata (Não pode ser instanciada)
 */
public abstract class Pessoa {
	//Atributos
	protected String nome, sexo;
	protected int idade;
	protected double experiencia;
	
	//Métodos Especiais
	public Pessoa(String nome, String sexo, int idade) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.experiencia = 0;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(double experiencia) {
		this.experiencia = experiencia;
	}
	@Override
	public String toString() {
		return ", nome = " + nome + ", sexo = " + sexo + ", idade = " + idade + ", experiencia = " + experiencia;
	}
	
}
