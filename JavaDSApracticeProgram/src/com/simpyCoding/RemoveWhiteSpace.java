package com.simpyCoding;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String s="Its Very Easy";
		String remain="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(!Character.isWhitespace(c))
			{
				remain=remain+c;
			}
		}
		System.out.println(remain);
	}

}
