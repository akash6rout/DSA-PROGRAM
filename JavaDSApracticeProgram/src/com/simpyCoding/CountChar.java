package com.simpyCoding;

public class CountChar {

	public static void main(String[] args) {
		
		String s="Its Simple";
		/*int count=0;
		int countUprCase=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isLowerCase(c))
			{
				count++;
			}
			if(Character.isUpperCase(c))
			{
				countUprCase++;
			}
		}
		System.out.println(count);
		System.out.println(countUprCase);*/
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			char u=Character.toUpperCase(c);
			if(u=='I')
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
