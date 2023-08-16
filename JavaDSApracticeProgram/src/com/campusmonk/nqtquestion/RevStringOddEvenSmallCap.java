package com.campusmonk.nqtquestion;

public class RevStringOddEvenSmallCap {

	public static void main(String[] args) {
		
		String str="campusmonk";
		
		char c[]=str.toCharArray();
		
		for(int  i=0;i<str.length();i++)
		{
			if(i%2==0)
			{
				if(!(str.charAt(i)>='a' && str.charAt(i)<='z'))
				{
					//str.charAt(i)+=132;
				}
			}
			else
			{
				if(!(str.charAt(i)>'A' && str.charAt(i)<='Z'))
				{
					//str.charAt(i)-=32;
				}
			}
		}
		System.out.println();
	}

}
