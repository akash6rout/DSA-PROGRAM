package com.String;

public class ReverseAString {
	
	public static boolean isPalindrome(String str) {
		for(int i=0;i<str.length()/2;i++) {
			int n=str.length();
			if(str.charAt(i)!=str.charAt(n-1-i)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		String str="madam";
		System.out.println(isPalindrome(str));
		/*String string = "madam";
		String revString = "";
		
		for (int i = string.length() - 1; i >= 0; i--) {
			revString = revString + string.charAt(i);
		}
		
		if (string.equals(revString)) {
			System.out.println("palindrome yes");
		} else {
			System.out.println("palindrome no");
		}*/
		
		
	}

}

