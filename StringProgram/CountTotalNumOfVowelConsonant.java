package StringProgram;

public class CountTotalNumOfVowelConsonant {
	public static void main(String args[]) {
		int vcount = 0;
		int ccount = 0;

		String str = "abcdefghijklmnopqrstuvwxyz";

		// Converting entire string to lower case to reduse comparison
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vcount++;
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				ccount++;
			}
		}
		System.out.println("Number of vowel is:" + vcount);
		System.out.println("Number of consonant is:" + ccount);
	}
}