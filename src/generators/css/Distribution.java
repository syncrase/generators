package generators.css;

import java.security.InvalidParameterException;

public class Distribution extends DistributionAbstract {

	private boolean isBOTTOMRIGHT;
	private boolean isTOPRIGHT;
	private boolean isBOTTOMLEFT;
	private boolean isTOPLEFT;

	public Distribution(int distribution) {
		super();
		if (distribution < 1 || distribution > 15) {
			throw new InvalidParameterException(
					"The distribution parameter must be between 1 and 15. See the javadoc.");
		}
		if (((double) distribution / (double) TOPLEFT) >= 1) {
			// il y a un topleft
			distribution -= TOPLEFT;
			this.isTOPLEFT = true;
		}
		if (((double) distribution / (double) BOTTOMLEFT) >= 1) {
			// il y a un bottomleft
			distribution -= BOTTOMLEFT;
			this.isBOTTOMLEFT = true;
		}
		if (((double) distribution / (double) TOPRIGHT) >= 1) {
			// il y a un bottomleft
			distribution -= TOPRIGHT;
			this.isTOPRIGHT = true;
		}
		if (((double) distribution / (double) BOTTOMRIGHT) >= 1) {
			// il y a un bottomleft
			distribution -= BOTTOMRIGHT;
			this.isBOTTOMRIGHT = true;
		}
//		System.out.println("isTOPLEFT : " + isTOPLEFT + "\nisBOTTOMLEFT : " + isBOTTOMLEFT + "\nisTOPRIGHT : "
//				+ isTOPRIGHT + "\nisBOTTOMRIGHT : " + isBOTTOMRIGHT);
	}

	public boolean isBOTTOMRIGHT() {
		return isBOTTOMRIGHT;
	}

	public void setBOTTOMRIGHT(boolean isBOTTOMRIGHT) {
		this.isBOTTOMRIGHT = isBOTTOMRIGHT;
	}

	public boolean isTOPRIGHT() {
		return isTOPRIGHT;
	}

	public void setTOPRIGHT(boolean isTOPRIGHT) {
		this.isTOPRIGHT = isTOPRIGHT;
	}

	public boolean isBOTTOMLEFT() {
		return isBOTTOMLEFT;
	}

	public void setBOTTOMLEFT(boolean isBOTTOMLEFT) {
		this.isBOTTOMLEFT = isBOTTOMLEFT;
	}

	public boolean isTOPLEFT() {
		return isTOPLEFT;
	}

	public void setTOPLEFT(boolean isTOPLEFT) {
		this.isTOPLEFT = isTOPLEFT;
	}

}
