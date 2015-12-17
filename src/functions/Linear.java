package functions;

public class Linear implements IFunction {

	private double ordonneALOrigine;
	private double coefficientDirecteur;
	
	/**
	 * 
	 * @param coefficientDirecteur
	 */
	public Linear(double coefficientDirecteur){
		super();
		new Linear((double)0,coefficientDirecteur);
	}
	
	/**
	 * 
	 * @param ordonneALOrigine
	 * @param coefficientDirecteur
	 */
	public Linear(double ordonneALOrigine, double coefficientDirecteur){
		this.ordonneALOrigine = ordonneALOrigine;
		this.coefficientDirecteur = coefficientDirecteur;
	}
	
	/**
	 * 
	 * @return
	 */
	public double getOrdonneALOrigine() {
		return ordonneALOrigine;
	}
	
	/**
	 * 
	 * @return
	 */
	public double getCoefficientDirecteur() {
		return coefficientDirecteur;
	}
	
	/**
	 * 
	 * @param ordonne
	 * @return The y value for a specified x
	 */
	@Override
	public double getAbscisse(double ordonne){
		return ordonneALOrigine + coefficientDirecteur * ordonne;
	}
	
	/**
	 * 
	 * @param abscisse
	 * @return The x value for a specified y
	 */
	@Override
	public double getOrdonne(double abscisse){
		return (abscisse - ordonneALOrigine)/coefficientDirecteur;
	}
}
