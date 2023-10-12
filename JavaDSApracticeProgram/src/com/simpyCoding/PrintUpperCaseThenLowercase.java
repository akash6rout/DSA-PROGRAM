package com.simpyCoding;

public class PrintUpperCaseThenLowercase {

	public static void main(String[] args) {
		
		String s="Its Simple And Easy";
		
		String upperCase="",lowerCase="";
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isUpperCase(c))
			{
				upperCase=upperCase+c;
			}else {
				lowerCase=lowerCase+c;
			}
		}
		String tsString=upperCase+lowerCase;
		System.out.println(tsString);

	}

}
