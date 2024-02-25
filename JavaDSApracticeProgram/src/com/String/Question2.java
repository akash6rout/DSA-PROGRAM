package com.String;

public class Question2 {
	
	public static void reverseString(String str) {
		String result="";
		for(int i=str.length()-1;i>=0;i--) {
			result+=str.charAt(i);
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		reverseString("akash");
	}

}
