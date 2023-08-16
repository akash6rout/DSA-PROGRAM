package com.String;

public class ValidPalindromep1 {

	public static void main(String[] args) {
		
		/*
		 * Scanner scanner=new Scanner(System.in);
		 * System.out.println("Enter your name"); String a=scanner.nextLine(); String
		 * b="akash"; if (a.equals(b)) { System.out.println("good morning"); }else {
		 * System.out.println("wrong name"); }
		 */
		String string="madam";
		String revString="";
		
		for(int i=string.length()-1; i>=0; i--)
		{
			revString=revString+string.charAt(i);
		}
		//System.out.println(revString);
		if(string.equals(revString))
		{
			System.out.println("Palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}
}
