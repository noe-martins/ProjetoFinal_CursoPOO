
package Parte3_14b;

/** Aprendizado:
 *  	1) Implementando uma interface na classe
 *  	2) Usando sobreposição em métodos abstratos
 */
public class Video implements AcoesVideo {
	//Atributos
	private String titulo;
	private int avaliacao, views, curtidas;
	private boolean reproduzindo;
	
	//Métodos Especiais
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public boolean isReproduzindo() {
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
	
	//Construtor deixando tudo zerado
	public Video(String titulo) {
		super();
		this.titulo = titulo;
		this.avaliacao = 0;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}

	//Métodos para Implementação
	@Override
	public void play() {
		if (this.isReproduzindo() == false) {
			this.setReproduzindo(true);
		}
	}

	@Override
	public void pause() {
		if (this.isReproduzindo() == true) {
			this.setReproduzindo(false);
		}
	}

	@Override
	public void like() {
		this.setCurtidas(this.getCurtidas() + 1);
	}

	@Override
	public String toString() {
		return "Video [titulo = " + titulo + ", avaliacao = " + avaliacao + ", views = " + views + ", curtidas = " + curtidas
				+ ", reproduzindo = " + reproduzindo + "]";
	}
	
	
}
