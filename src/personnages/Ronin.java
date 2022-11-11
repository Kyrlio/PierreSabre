package personnages;

public class Ronin extends Humain {
	int honneur = 1;

	public Ronin(String nom, String boissonFav, int qteArgent) {
		super(nom, boissonFav, qteArgent);
		// TODO Auto-generated constructor stub
	}
	
	public void donner(Commercant beneficiaire) {
		int dix_pourcent = 10 * getQteArgent() / 100;
		parler(beneficiaire.getNom() + ", prend ces " + dix_pourcent + " sous.");
		beneficiaire.recevoir(dix_pourcent);
		perdreArgent(dix_pourcent);
	}

}
