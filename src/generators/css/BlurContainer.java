package generators.css;

import java.security.InvalidParameterException;
import java.util.ArrayList;

import functions.Linear;

public class BlurContainer {

	public BlurContainer() {
	}

	/**
	 * 
	 * Génération d'un box-shadow. Prend en entrée les différents code couleurs,
	 * le pas de décallage et le pas de blur, le décallage de départ et le blur
	 * de départ. Prends aussi en charge les longueurs des dégradés. Formule
	 * mathématique : La couleur c varie pour l allant de 0 à L (longueur) c =
	 * f(l) Donner une fonction entrée et les couleurs sont calculée
	 * automatiquement => se faire une échelle des couleurs où elles sont toutes
	 * présentent. Les couleurs de #000000 à #FFFFFF
	 * 
	 * Table de vérité 1 BOTTOMRIGHT 2 TOPRIGHT 3 BOTTOMRIGHT + TOPRIGHT 4
	 * BOTTOMLEFT 5 BOTTOMLEFT + BOTTOMRIGHT 6 BOTTOMLEFT + TOPRIGHT 7
	 * BOTTOMLEFT + BOTTOMRIGHT + TOPRIGHT 8 TOPLEFT 9 TOPLEFT + BOTTOMRIGHT 10
	 * TOPLEFT + TOPRIGHT 11 TOPLEFT + BOTTOMRIGHT + TOPRIGHT 12 TOPLEFT +
	 * BOTTOMLEFT 13 TOPLEFT + BOTTOMLEFT + BOTTOMRIGHT 14 TOPLEFT + BOTTOMLEFT
	 * + TOPRIGHT 15 TOPLEFT + BOTTOMLEFT + BOTTOMRIGHT + TOPRIGHT
	 * 
	 * @param startColor
	 * @param endColor
	 * @param steps
	 * @param stepInPixel
	 * @param blurInPixel
	 * @param blurDistribution
	 *            Utiliser les valeurs issues de la classe DistributionAbstract.
	 *            Valeur comprise entre 1 et 15 inclus
	 * @return
	 */
	public static String generateBoxShadow(Color startColor, Color endColor, int steps, double xStepInPixel,
			double yStepInPixel, double blurInPixel, int blurDistribution) {

		// TODO coder d'autres fonctions

		if(xStepInPixel<0 ||yStepInPixel<0||blurInPixel<0){
			throw new InvalidParameterException("Values in pixels must positives.");
		}
		
		ArrayList<Color> colorList = ColorBlender.blendColor(startColor, endColor, steps);

		Distribution distribution = new Distribution(blurDistribution);
		Linear xFunction = new Linear(xStepInPixel, xStepInPixel);
		Linear yFunction = new Linear(yStepInPixel, yStepInPixel);
		Linear blurFunction = new Linear(blurInPixel, blurInPixel / 2.0);
		// TODO Pouvoir avoir myBlur1, myBlur2, ... myBlur4 puis pouvoir faire
		// Blur.formateCSS(myBlur1, ...)
		// Blur.formateCSS(Blur...);
		Blur myBlur = new Blur(colorList, distribution, xFunction, yFunction, blurFunction);
		return myBlur.getFormattedCSS();
	}
}
