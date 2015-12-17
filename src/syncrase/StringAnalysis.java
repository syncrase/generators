package syncrase;

/**
 * Used to check the meta tags content to improve the SEO
 * @author Pierre
 *
 */
public class StringAnalysis {

	/**
	 * Check the keyworks meta tag
	 * @param keywordsContent
	 */
	public static void keywordsAnalisys(String keywordsContent) {
		System.out.println("Keywords analysis");
		System.out.println("\tChars number (max. 1000) : " + keywordsContent.length());
		System.out.println("\tExpressions number between ',' (max. 200 à 300) : " + keywordsContent.split(",").length);
	}

	/**
	 * Check the description meta tag
	 * @param descriptionContent
	 */
	public static void descriptionAnalisys(String descriptionContent) {
		System.out.println("Description analysis");
		System.out.println("\tChars number (max. 200) : " + descriptionContent.length());
		// Count accents
		char[] descriptionCharsTab = descriptionContent.toCharArray();
		int count = 0;
		for (int i = 0; i < descriptionContent.length(); i++) {
			if (descriptionCharsTab[i] == 'é' || descriptionCharsTab[i] == 'è' || descriptionCharsTab[i] == 'ô'
					|| descriptionCharsTab[i] == 'à') {
				count++;
			}
		}
		System.out.println("\tAccentuated char number (recommended to doesn't have anyone) : " + count);
	}
}
