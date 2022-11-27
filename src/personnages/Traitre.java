package personnages;

import java.util.Random;

public class Traitre extends Samourai {
	private int niveauTraitrise;

	public Traitre(String seigneur, String nom, String boissonFav, int qteArgent) {
		super(seigneur, nom, boissonFav, qteArgent);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traître et mon niveau de traitrîse est : " + niveauTraitrise + ". Chut !");
	}
	
	public void ranconner(Commercant commercant) {
		if (niveauTraitrise < 3) {
			int ranconnerArgent = commercant.getQteArgent() * 2/10;
			gagnerArgent(ranconnerArgent);
			niveauTraitrise++;
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne moi " +
			ranconnerArgent + " sous ou gare à toi !");
			commercant.parler("Tout de suite grand " + getNom() + ".");
			//Le commerçant ne perd pas d'argent ??
			
		} else {
			parler("Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer !");
		}
	}
	
	public void faireLeGentil() {
		if (nbConnaissance < 1) {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.");
		} else {
			Random randomNumber = new Random();
			Humain ami = memoire[randomNumber.nextInt(nbConnaissance)]; //choisis un amis aléatoirement parmis les amis
			int don = getQteArgent() * 1/20;
			parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec " + ami.getNom() + ".");
			parler("Bonjour " + ami.getNom() + " ! Je voudrais vous aider en vous donnant " + don + " sous.");
			ami.gagnerArgent(don);
			perdreArgent(don);
			ami.parler("Merci " + this.getNom() + ". Vous êtes quelqu'un de bien.");
			
			if (niveauTraitrise >= 1) {
				niveauTraitrise--;
			}			
		}
	}

}
