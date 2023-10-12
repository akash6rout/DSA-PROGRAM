package com.simpyCoding.wordLevel;

public class PrintSeparateWord {

	public static void main(String[] args) {
		String s="The Sagar Kumar Rout";
		String wordContainer="";
		s+=" ";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
			{
				wordContainer+=c;
			}else {
				System.out.println(wordContainer);
				wordContainer="";
			}
		}

	}

}
