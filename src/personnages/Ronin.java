package personnages;

public class Ronin extends Humain {
	int honneur = 1;

	public Ronin(String nom, String boissonFav, int qteArgent) {
		super(nom, boissonFav, qteArgent);
	}
	
	public void donner(Commercant beneficiaire) {
		int dixPourcent = 10 * getQteArgent() / 100;
		parler(beneficiaire.getNom() + ", prend ces " + dixPourcent + " sous.");
		beneficiaire.recevoir(dixPourcent);
		perdreArgent(dixPourcent);
	}
	
	public void provoquer(Yakuza adversaire) {
		int force = 2*honneur;
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (force >= adversaire.reputation) {
			parler("Je t'ai eu petit yakuza!");
			gagnerArgent(adversaire.getQteArgent());
			adversaire.perdre();
			honneur++;
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(getQteArgent());
			perdreArgent(getQteArgent());
			honneur--;
		}
	}

}
