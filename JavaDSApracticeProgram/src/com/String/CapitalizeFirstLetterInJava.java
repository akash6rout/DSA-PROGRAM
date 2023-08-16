package com.String;

public class CapitalizeFirstLetterInJava {

	public static void main(String[] args) {
		
		  String str = "i am going to school";
		 
		  String arr[] = str.split(" ");
		  
		  String requiredString = " ";
		  
		  for (int i = 0; i < arr.length; i++) { 
		
		  char c = arr[i].charAt(0);// i a g t s
		  
		  String c1 = String.valueOf(c).toUpperCase();
		  
		  String sub = arr[i].substring(1);
		  
		  requiredString =requiredString + c1 + sub + " "; }
		  System.out.println(requiredString.trim()); }
		 
		/*String str = "i am going to school";
		String arr[] = str.split(" ");
		String reqStr = " ";

		for (int i = 0; i < arr.length; i++) {
			char c = arr[i].charAt(0);// i a g t s
			String c1 = String.valueOf(c).toUpperCase();
			String sub = arr[i].substring(1);
			reqStr = reqStr + c1 + sub + " ";// I Am Going
		}
		System.out.println(reqStr.trim());*/
	}


