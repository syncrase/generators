package functions;

public interface IFunction {
	/**
	 * Get the y value for a specific x value
	 * @param abscisse la valeur x
	 * @return y=f(x)
	 */
	public double getOrdonne(double abscisse);
	/**
	 * Get the x value for a specific y value
	 * @param ordonne
	 * @return
	 */
	public double getAbscisse(double ordonne);
}
