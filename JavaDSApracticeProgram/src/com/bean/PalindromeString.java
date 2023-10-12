package com.bean;

public class PalindromeString {

	public static void main(String[] args) {
		
		String str="madam";
		String tempString="";
		for(int i=str.length()-1;i>=0;i--)
		{
			tempString=tempString+str.charAt(i);
		}
		if(tempString.equals(str))
		{
			System.out.println("this is a palindrome");
		}else {
			System.out.println("this is not");
		}
	}
}
