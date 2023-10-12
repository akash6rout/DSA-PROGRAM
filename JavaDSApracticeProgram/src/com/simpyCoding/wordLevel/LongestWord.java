package com.simpyCoding.wordLevel;

public class LongestWord {
	
	public static void main(String[] args) {
		String wString="";
		String s="A RED SEED";
		s+=" ";
		String longestwString="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
			{
				wString +=c;
			}else {
				if(wString.length()>longestwString.length())
					longestwString=wString;
				wString="";
			}
		}
		System.out.println(longestwString);
	}

}
