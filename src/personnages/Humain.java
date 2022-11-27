package personnages;

public class Humain {
	private String nom;
	private String boissonFav;
	private int qteArgent;
	protected int nbConnaissance = 0;
	protected Humain[] memoire = new Humain[30];
	
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
	
	protected void parler(String texte) {
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
	
	protected void gagnerArgent(int gain) {
		qteArgent += gain;
	}
	
	protected void perdreArgent(int perte) {
		qteArgent -= perte;
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}
	
	private void memoriser(Humain autreHumain) {
		if (nbConnaissance < 3) {
			memoire[nbConnaissance] = autreHumain;
			nbConnaissance++;
		} else {
			nbConnaissance = 0;
			memoire[nbConnaissance] = autreHumain;
		}
		
	}
	
	private void repondre(Humain autreHumain) {
		direBonjour();
		memoriser(autreHumain);
	}
	
	public void listerConnaissance() {
		System.out.print("Je connais beaucoup de monde dont : ");
		for (int i = 0 ; i < memoire.length ; i++) {
			if (memoire[i] != null) {
				System.out.print(memoire[i].getNom() + ", ");
			}
		}
		System.out.println();
	}
	

}
