package com.String;

public class ReverseString {
    public static String reverseWords(String S) {
        // Split the input string into words using dot as a separator
        String[] words = S.split("\\.");

        // Reverse the array of words
        int left = 0;
        int right = words.length - 1;
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }

        // Join the reversed words back together using dot as separator
        StringBuilder reversedString = new StringBuilder();
        for (String word : words) {
            reversedString.append(word).append(".");
        }

        return reversedString.toString().substring(0, reversedString.length() - 1);
    }

    public static void main(String[] args) {
        String input1 = "i.like.this.program.very.much";
        System.out.println(reverseWords(input1));  // Output: much.very.program.this.like.i

        String input2 = "pqr.mno";
        System.out.println(reverseWords(input2));  // Output: mno.pqr
    }
}

