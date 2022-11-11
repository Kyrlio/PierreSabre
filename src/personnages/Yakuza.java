package personnages;

public class Yakuza extends Humain {
	String clan;
	int reputation = 0;

	public Yakuza(String nom, String boissonFav, int qteArgent, String clan) {
		super(nom, boissonFav, qteArgent);
		this.clan = clan;
		// TODO Auto-generated constructor stub
	}
	
	public void extorquer(Commercant victime) {
		int victimeArgent = victime.getQteArgent();
		gagnerArgent(victime.getQteArgent());
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		victime.seFaireExtorquer();
		reputation++;
		parler("J'ai piqué les " + victimeArgent + " sous de " + victime.getNom() + ", ce qui me fait "
				+ getQteArgent() + " sous dans ma poche. Hi ! Hi !");
	}

}
