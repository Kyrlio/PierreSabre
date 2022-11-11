package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Yakuza;

public class HistoireTP4 {
	
	public static void main(String[] args) {
//		Humain prof = new Humain("Prof", "kombucha", 54);
//		prof.direBonjour();
//		prof.parler("J'ai " + prof.getQteArgent() + " sous en poche. Je vais pouvoir m'offrir une boisson à 12 sous");
//		prof.boire();
//		prof.perdreArgent(12);
//		prof.parler("J'ai " + prof.getQteArgent() + " sous en poche. Je vais pouvoir m'offrir un jeu à 2 sous");
//		prof.perdreArgent(2);
//		prof.parler("Je n'ai plus que " + prof.getQteArgent() + " sous en poche. Je ne peux même pas m'offrir un kimono à 50 sous.");
//		
		Commercant marco = new Commercant("Marco", "thé", 15);
//		marco.direBonjour();
//		marco.seFaireExtorquer();
//		marco.recevoir(15);
//		marco.acheter("thé", 3);
		
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		yaku.direBonjour();
		yaku.extorquer(marco);
		
 }

}
