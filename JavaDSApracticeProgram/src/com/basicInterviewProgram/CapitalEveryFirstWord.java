package com.basicInterviewProgram;

public class CapitalEveryFirstWord {

	public static void main(String[] args) {
		
		String string="puja rani rout";
		
		String arr[]=string.split(" ");
		
		String reqString=" ";
		
		for(int i=0;i<arr.length;i++) {
			char c=arr[i].charAt(0);//p r r
			String c1=String.valueOf(c).toUpperCase();//P R R
			String subString=arr[i].substring(1);
			reqString=reqString+c1+subString+" ";
		}
		System.out.println(reqString.trim());
	}
}
