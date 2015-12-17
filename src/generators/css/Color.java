package generators.css;

import java.security.InvalidParameterException;

public class Color {
	/**
	 * Format #XXXXXX where X is between 0 and F
	 */
	private String hexValue;

	private int red;
	private int green;
	private int blue;

	public Color(String hexValue) {
		this.hexValue = hexValue;
		// An hex color is #RRGGBB
		// "0x"+;
		int hex = (int) Long.parseLong(hexValue.split("#")[1], 16);

		int r, g, b;
		r = (hex & 0xFF0000) >> 16;
		g = (hex & 0xFF00) >> 8;
		b = (hex & 0xFF);
		if (!(r < 0) && !(r > 255) && !(g < 0) && !(g > 255) && !(b < 0) && !(b > 255)) {
			this.red = r;
			this.green = g;
			this.blue = b;
		} else {
			throw new InvalidParameterException("The desired color (" + hexValue
					+ ") doesn't exist. This hexadecimal value must be between #000000 and #FFFFFF");
		}

	}

	public Color(int r, int g, int b) {
		if(!(r < 0) && !(r > 255) && !(g < 0) && !(g > 255) && !(b < 0) && !(b > 255)){
			this.red = r;
			this.green = g;
			this.blue = b;
			hexValue = Color.toHex(r, g, b);
		}else{
			throw new InvalidParameterException("The desired color (" + r
					+ ", "+g+", "+b+") doesn't exist. RGB values must be between 0 and 255");
		}
		
	}

	public String getHexValue() {
		return hexValue;
	}

	public int getRed() {
		return red;
	}

	public int getGreen() {
		return green;
	}

	public int getBlue() {
		return blue;
	}

	/**
	 * Returns a web browser-friendly HEX value representing the colour in the
	 * default sRGB ColorModel.
	 *
	 * @param r
	 *            red
	 * @param g
	 *            green
	 * @param b
	 *            blue
	 * @return a browser-friendly HEX value
	 */
	public static String toHex(int r, int g, int b) {
		return "#" + toBrowserHexValue(r) + toBrowserHexValue(g) + toBrowserHexValue(b);
	}

	private static String toBrowserHexValue(int number) {
		StringBuilder builder = new StringBuilder(Integer.toHexString(number & 0xff));
		while (builder.length() < 2) {
			builder.append("0");
		}
		return builder.toString().toUpperCase();
	}

}
