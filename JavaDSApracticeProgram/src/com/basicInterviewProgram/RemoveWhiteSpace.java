package com.basicInterviewProgram;

public class RemoveWhiteSpace {
	
	public static void main(String[] args) {
		String string="Akash Kumar Rout";
		String nospace=string.replaceAll("\\s", "");
		System.out.println(nospace);
		
		char strArray[]=string.toCharArray();
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<strArray.length;i++) {
			if((strArray[i]!=' ')&&(strArray[i]!='\t')) {
				sb.append(strArray[i]);
			}
		}
		String noSpace=sb.toString();
		System.out.println(noSpace);
	}

}
