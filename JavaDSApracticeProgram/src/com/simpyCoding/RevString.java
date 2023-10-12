package com.simpyCoding;

public class RevString {

	public static void main(String[] args) {
		String s="madam";
		String revString="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			revString=c+revString;
		}
		//System.out.println(revString);
		if(s.equalsIgnoreCase(revString))
		{
			System.out.println("Yes it is");
		}
		else {
			System.out.println("No it is not");
		}

	}

}
