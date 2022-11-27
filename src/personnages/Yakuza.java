package personnages;

public class Yakuza extends Humain {
	String clan;
	int reputation = 0;

	public Yakuza(String nom, String boissonFav, int qteArgent, String clan) {
		super(nom, boissonFav, qteArgent);
		this.clan = clan;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de " + clan + ".");
	}
	
	public void extorquer(Commercant victime) {
		int victimeArgent = victime.seFaireExtorquer();
		gagnerArgent(victime.getQteArgent());
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		victime.seFaireExtorquer();
		reputation++;
		parler("J'ai piqué les " + victimeArgent + " sous de " + victime.getNom() + ", ce qui me fait "
				+ getQteArgent() + " sous dans ma poche. Hi ! Hi !");
	}
	
	public void perdre() {
		reputation --;
		parler("J'ai perdu mon duel et mes " + getQteArgent() + " sous, snif... J'ai déshonoré le clan de " + clan + ".");
		perdreArgent(getQteArgent());
	}
	
	public void gagner(int gain) {
		reputation ++;
		gagnerArgent(gain);
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan + "? Je l'ai dépouillé de ses " + gain + " sous.");
	}

}
