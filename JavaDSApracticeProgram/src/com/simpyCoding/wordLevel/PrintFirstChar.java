package com.simpyCoding.wordLevel;

public class PrintFirstChar {

	public static void main(String[] args) {
		String s="In the box";
		String wordContainer="";
		s+=" ";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
			{
				wordContainer+=c;
			}else {
				//System.out.println(wordContainer.charAt(0));
				//System.out.println(wordContainer.substring(0,2));
				//if(wordContainer.startsWith("t"))
					//System.out.println(wordContainer);
				if(wordContainer.length()==3)
					System.out.println(wordContainer);
				wordContainer="";
			}
		}

	}

}
