package generators.css;

import java.util.ArrayList;

public class ColorBlender {

	public static ArrayList<Color> blendColor(Color startColor, Color endColor, int midPoints) {
		ArrayList<Color> colorBlended = new ArrayList<Color>();
		midPoints++;
		double redStep = (startColor.getRed() - endColor.getRed()) / (double) midPoints;
		double greenStep = (startColor.getGreen() - endColor.getGreen()) / (double) midPoints;
		double blueStep = (startColor.getBlue() - endColor.getBlue()) / (double) midPoints;
//		System.out.println(redStep + " = " + startColor.getRed() + " - " + endColor.getRed() + "/ " + midPoints + "\n"
//				+ greenStep + "-" + blueStep);
		Color color;
		for (int i = 0; i < midPoints + 1; i++) {
			color = new Color((int) ((double) startColor.getRed() - (redStep * (double) i)),
					(int) ((double) startColor.getGreen() - greenStep * (double) i),
					(int) ((double) startColor.getBlue() - blueStep * (double) i));
			colorBlended.add(color);
//			System.out.println(i + " : " + color.getRed() + "-" + color.getGreen() + "-" + color.getBlue() + " : "
//					+ color.getHexValue());
		}

		return colorBlended;
	}

}
