package syncrase;

import generators.css.BlurContainer;
import generators.css.Color;
import generators.css.DistributionAbstract;

public class Main {

	public static void main(String[] args) {
		// StringAnalysis.keywordsAnalisys(
		// "morethanschool, More Than School, more than school, Soutien
		// scolaire,Soutien scolaire "
		// + "� domicile,cours de soutien, soutien maths, Cours
		// particuliers,Cours particuliers "
		// + "� domicile,Professeur particulier,Maroc,Cours de maths,Exercices
		// maths,Pr�paration "
		// + "maths,Soutien maths,Professeur maths,Aide en maths,Accompagnement
		// maths,Aide aux "
		// + "devoirs,Maths Rabat,Cours � la maison,Enseignement �
		// domicile,Cours particuliers � "
		// + "la maison,Maths,Cours Rabat,Cours de soutien Rabat,Rabat,Cours de
		// physique,Professeur "
		// + "particulier maths,Prof particulier physique,Professeur de,Prof
		// de,Pr�paration Bac,Cours"
		// + " particuliers Lyc�e,Cours particuliers coll�ge,Profs
		// particuliers,Cours maths,Cours "
		// + "Rabat,Professeur maths,Professeurs,annonces course");

		// StringAnalysis.descriptionAnalisys(
		// "More Than School est un organisme mettant en relation des
		// professeurs et des �l�ves "
		// + "pour des cours particuliers � domicile sur Rabat et les environs.
		// Notre �quipe de "
		// + "professeurs a �t� rigoureusement s�lectionn�e pour son haut niveau
		// de formation. "
		// + "En vous inscrivant chez nous, nous vous garantissons:- un
		// professeur recrut� pour "
		// + "ses qualit�s p�dagogiques- un premier cours mis en place sous 48h
		// maximum � compter "
		// + "de votre inscription- des tarifs pr�f�rentielsN'h�sitez pas � nous
		// contacter pour "
		// + "plus d'informations au 05 37 68 27 68 ou au 06 15 17 49 56. Ou
		// contactez-nous par "
		// + "e-mail � contact@morethanschool.ma.Vous avez aussi la possibilit�
		// de visiter notre "
		// + "site internet sur : www.morethanschool.ma, ou m�me de passer � nos
		// bureaux au 88 "
		// + "rue Oued Ziz � Agdal (Rabat) du lundi au vendredi de 10h � 20h.");

		// TODO blinder les entr�es de fonctions + javadoc
		// TODO compiler le jar
		// TODO Interface graphique avec formulaire pour g�n�rer le box-shadow
		System.out.println(BlurContainer.generateBoxShadow(new Color("#000000"), new Color("#FFFFFF"), 100, 0.5, 0.5,
				0.1, DistributionAbstract.BOTTOMRIGHT + DistributionAbstract.BOTTOMLEFT));
	}
}
