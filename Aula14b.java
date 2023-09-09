package Parte3_14b;

/**
 * Aprendizado:
 * 	1) Unindo conceitos de Herança, Encapsulamento e Polimorfismo
 */
public class Aula14b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gafanhoto g1[] = new Gafanhoto[2];
		Video video1[] = new Video[2];
		Visualizacao vis[] = new Visualizacao[2];
		
		g1[0] = new Gafanhoto("Noé", "M", 29, "nono");
		video1[0] = new Video("As aventuras de tintin");
		vis[0] = new Visualizacao(g1[0], video1[0]);
		
		System.out.println(g1[0].toString());
		System.out.println(video1[0].toString());
		System.out.println(vis[0].toString());
		
	}

}
