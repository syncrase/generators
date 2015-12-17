package syncrase;

import generators.css.BlurContainer;
import generators.css.Color;
import generators.css.DistributionAbstract;

public class Main {

	public static void main(String[] args) {
		// StringAnalysis.keywordsAnalisys(
		// "morethanschool, More Than School, more than school, Soutien
		// scolaire,Soutien scolaire "
		// + "à domicile,cours de soutien, soutien maths, Cours
		// particuliers,Cours particuliers "
		// + "à domicile,Professeur particulier,Maroc,Cours de maths,Exercices
		// maths,Préparation "
		// + "maths,Soutien maths,Professeur maths,Aide en maths,Accompagnement
		// maths,Aide aux "
		// + "devoirs,Maths Rabat,Cours à la maison,Enseignement à
		// domicile,Cours particuliers à "
		// + "la maison,Maths,Cours Rabat,Cours de soutien Rabat,Rabat,Cours de
		// physique,Professeur "
		// + "particulier maths,Prof particulier physique,Professeur de,Prof
		// de,Préparation Bac,Cours"
		// + " particuliers Lycée,Cours particuliers collège,Profs
		// particuliers,Cours maths,Cours "
		// + "Rabat,Professeur maths,Professeurs,annonces course");

		// StringAnalysis.descriptionAnalisys(
		// "More Than School est un organisme mettant en relation des
		// professeurs et des élèves "
		// + "pour des cours particuliers à domicile sur Rabat et les environs.
		// Notre équipe de "
		// + "professeurs a été rigoureusement sélectionnée pour son haut niveau
		// de formation. "
		// + "En vous inscrivant chez nous, nous vous garantissons:- un
		// professeur recruté pour "
		// + "ses qualités pédagogiques- un premier cours mis en place sous 48h
		// maximum à compter "
		// + "de votre inscription- des tarifs préférentielsN'hésitez pas à nous
		// contacter pour "
		// + "plus d'informations au 05 37 68 27 68 ou au 06 15 17 49 56. Ou
		// contactez-nous par "
		// + "e-mail à contact@morethanschool.ma.Vous avez aussi la possibilité
		// de visiter notre "
		// + "site internet sur : www.morethanschool.ma, ou même de passer à nos
		// bureaux au 88 "
		// + "rue Oued Ziz à Agdal (Rabat) du lundi au vendredi de 10h à 20h.");

		// TODO blinder les entrées de fonctions + javadoc
		// TODO compiler le jar
		// TODO Interface graphique avec formulaire pour générer le box-shadow
		System.out.println(BlurContainer.generateBoxShadow(new Color("#000000"), new Color("#FFFFFF"), 100, 0.5, 0.5,
				0.1, DistributionAbstract.BOTTOMRIGHT + DistributionAbstract.BOTTOMLEFT));
	}
}
