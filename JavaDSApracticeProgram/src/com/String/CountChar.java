package com.String;

public class CountChar {
	
	public static String getString(String string,char c)
	{
		return string.replaceAll("[aeiouAEIOU]",""+c);
	}
	public static String replaceNumToHash(String string,char c)
	{
		return string.replaceAll("[123456789]",""+c);
		
	}

	public static void main(String[] args) {
		
		String string="The7Akash2Kumar4Rout";
		
		System.out.println("Original String is"+string);
		
		System.out.println("Specified char"+getString(string, '#'));
		
		System.out.println("Digit to hash"+replaceNumToHash(string, '#'));
		
		
	}
}
