package Parte3_14b;

/**
 * Aprendizado:
 * 	1) Especialização de uma classe (Conceito de herança)
 */
public class Gafanhoto extends Pessoa {
	//Atributos
	private String login;
	private int totAssistido;
	
	//Construtor das duas classes
	public Gafanhoto(String nome, String sexo, int idade, String login) {
		super(nome, sexo, idade);
		this.login = login;
		this.totAssistido = 0;
	}
	//Métodos Especiais
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	} 
	
	public void viuMaisUm() {
		this.setTotAssistido(this.getTotAssistido() + 1);
	}
	@Override
	public String toString() {
		return "Gafanhoto [login = " + login + ", totAssistido = " + totAssistido + super.toString() + "]";
	} //super -> Chama classe herdada
	
}
