package com.simpyCoding;

public class DigitsFirstThenCharLast {

	public static void main(String[] args) {
		String s="NO26 Sound";
		
		String digit="",remain="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isDigit(c))
			{
				digit=digit+c;
			}else {
				remain=remain+c;
			}
		}
		String senString=digit+remain;
		System.out.println(senString);
	}

}
