package StringProgram;

public class PalidromeString {
    public static void main(String[] args) {
        String str = "kayak";

        boolean string = true;

        str = str.toLowerCase();

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                string = false;
                break;
            }
        }
        if (string)
            System.out.println("Given string is palindrome");
        else
            System.out.println("given string is not palindrome");
    }
}
