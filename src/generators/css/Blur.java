package generators.css;

import java.util.ArrayList;

import functions.IFunction;

public class Blur implements CSSGenerator {

	ArrayList<BlurLevel> myBlur = new ArrayList<BlurLevel>();

	public Blur(ArrayList<Color> colorList, Distribution distribution,
			IFunction xFunction, IFunction yFunction, IFunction blurFunction) {

		BlurLevel blurLevel;
		double x, y, blur;
		
		for (Color color : colorList) {
			blurLevel = new BlurLevel(distribution);
			x = xFunction.getAbscisse(colorList.indexOf(color));
			y = yFunction.getAbscisse(colorList.indexOf(color));
			blur = blurFunction.getAbscisse(colorList.indexOf(color));
			blurLevel.addLevel(x, y, blur, color);
			myBlur.add(blurLevel);
		}
	}

	public String getFormattedCSS() {
		 String css = "box-shadow:";
//		String css = "";
		for (BlurLevel lvl : myBlur) {
			css += lvl.getFormattedCSS();
			// If I do not be at the end of the list I add the comma
			css += myBlur.indexOf(lvl) != myBlur.size() - 1 ? ",\n\t\t\t" : "";
		}
		 css += ";";
		return css;
	}

	/**
	 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	 * %%%%%%%
	 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	 * %%%%%%%
	 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	 * %%%%%%% Correspond to just one level of the complete blur
	 * 
	 * @author Pierre
	 *
	 */
	private class BlurLevel implements CSSGenerator {
		ArrayList<BlurAtom> level = new ArrayList<BlurAtom>();
		Distribution distribution;

		/**
		 * 
		 * 
		 * @param isBOTTOMRIGHT
		 * @param isTOPRIGHT
		 * @param isBOTTOMLEFT
		 * @param isTOPLEFT
		 */
		public BlurLevel(Distribution distribution) {
			super();
			this.distribution = distribution;
		}

		public void addLevel(double x, double y, double blur, Color color) {
			if (distribution.isBOTTOMRIGHT()) {
				level.add(new BlurAtom(x, y, blur, color));
			}
			if (distribution.isTOPRIGHT()) {
				level.add(new BlurAtom(x, -y, blur, color));
			}
			if (distribution.isBOTTOMLEFT()) {
				level.add(new BlurAtom(-x, y, blur, color));
			}
			if (distribution.isTOPLEFT()) {
				level.add(new BlurAtom(-x, -y, blur, color));
			}
		}

		public String getFormattedCSS() {
			String css = "";
			for (BlurAtom lvl : level) {
				css += lvl.getFormattedCSS();
				// If I do not be at the end of the list I add the comma
				css += level.indexOf(lvl) != level.size() - 1 ? ", " : "";

			}
			return css;
		}
	}

	/**
	 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	 * %%%%%%%
	 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	 * %%%%%%%
	 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	 * %%%%%%% Correspond to one border only of the blur
	 * 
	 * @author Pierre
	 *
	 */
	private class BlurAtom implements CSSGenerator {
		private double xValue;
		private double yValue;
		private double blurPixels;
		private Color color;

		/**
		 * 
		 * @param xValue
		 *            x offset
		 * @param yValue
		 *            y offset
		 * @param blurPixels
		 *            blur distance
		 * @param color
		 *            hexadecimal color => #XXXXXX
		 */
		public BlurAtom(double xValue, double yValue, double blurPixels, Color color) {
			super();
			this.xValue = xValue;
			this.yValue = yValue;
			this.blurPixels = blurPixels;
			this.color = color;
		}

		public double getxValue() {
			return xValue;
		}

		public double getyValue() {
			return yValue;
		}

		public double getBlurPixels() {
			return blurPixels;
		}

		public Color getColor() {
			return color;
		}

		public String getFormattedCSS() {
			return String.format("%.2f", this.getxValue()).replace(',', '.') + "px "
					+ String.format("%.2f", this.getyValue()).replace(',', '.') + "px "
					+ String.format("%.2f", this.getBlurPixels()).replace(',', '.') + "px " + this.getColor().getHexValue();
		}
	}
}
