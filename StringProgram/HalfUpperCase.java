package StringProgram;

public class HalfUpperCase {
	public static void main(String args[]) {
		String str = "abcdefghijklmnopqrstuvwxyz";

		int mid = str.length() / 2;

		String lower = " ";

		String Upper = " ";

		for (int i = 0; i < str.length(); i++) {
			if (i < mid) {
				Upper = Upper + Character.toUpperCase(str.charAt(i));
			}
		}
		System.out.println(Upper);
	}
}