package generators.css;

import java.io.Serializable;

public class BlurConfiguration implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6980448724712784735L;
	
	Color startColor, endColor;
	int steps, distribution;
	double horizontalStep, verticalStep, blurInPixel;




	public Color getStartColor() {
		return startColor;
	}

	public void setStartColor(Color startColor) {
		this.startColor = startColor;
	}

	public Color getEndColor() {
		return endColor;
	}

	public void setEndColor(Color endColor) {
		this.endColor = endColor;
	}

	public int getSteps() {
		return steps;
	}

	public void setSteps(int steps) {
		this.steps = steps;
	}

	public int getDistribution() {
		return distribution;
	}

	public void setDistribution(int distribution) {
		this.distribution = distribution;
	}

	public double getHorizontalStep() {
		return horizontalStep;
	}

	public void setHorizontalStep(double horizontalStep) {
		this.horizontalStep = horizontalStep;
	}

	public double getVerticalStep() {
		return verticalStep;
	}

	public void setVerticalStep(double verticalStep) {
		this.verticalStep = verticalStep;
	}

	public double getBlurInPixel() {
		return blurInPixel;
	}

	public void setBlurInPixel(double blurInPixel) {
		this.blurInPixel = blurInPixel;
	}

}
