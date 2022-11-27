package personnages;

public class Commercant extends Humain {
	private String boissonFav = "thé";

	public Commercant(String nom, int qteArgent) {
		super(nom, "thé", qteArgent);
		this.boissonFav = boissonFav;
		// TODO Auto-generated constructor stub
	}
	
	public int seFaireExtorquer() {
		int oldArgent = getQteArgent();
		perdreArgent(getQteArgent());
		parler("J'ai tout perdu ! Le monde est trop injuste...");
		return oldArgent;
	}
	
	public void recevoir(int argent) {
		parler(argent + " sous ! Je te remercie généreux donateur!");
		gagnerArgent(argent);
	}
	

}
