package personnages;

public class Humain {
	private String nom;
	private String boissonFav;
	private int qteArgent;
	
	public Humain(String nom, String boissonFav, int qteArgent) {
		this.nom = nom;
		this.boissonFav = boissonFav;
		this.qteArgent = qteArgent;
	}
	
	public String getNom() {
		return nom;
	}
	public String getBoissonFav() {
		return boissonFav;
	}
	public int getQteArgent() {
		return qteArgent;
	}
	
	public void parler(String texte) {
		System.out.println("[" + nom +"] - " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFav + ".");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFav + " ! GLOUPS !");
	}
	
	
	public void acheter(String bien, int prix) {
		if (qteArgent >= prix) {
			parler("Je viens d'acheter un " + bien);
			perdreArgent(prix);
		} else {
			parler("Je n'ai pas assez d'argent pour acheter un " + bien);
		}
	}
	
	public void gagnerArgent(int gain) {
		qteArgent += gain;
	}
	
	public void perdreArgent(int perte) {
		qteArgent -= perte;
	}
	

}
