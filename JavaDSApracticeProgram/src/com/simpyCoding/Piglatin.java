package com.simpyCoding;

public class Piglatin {

	public static void main(String[] args) {
		String s="EAT";
		String pl="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			char u=Character.toUpperCase(c);
			if(u=='A'||u=='E'||u=='I'||u=='O'||u=='U')
			{
				if(i==0)
				{
					pl=s+"WAY";
				}else {
					pl=s.substring(i)+s.substring(0,i)+"AY";
					break;
				}
			}
			System.out.println(pl);
		}

	}

}
