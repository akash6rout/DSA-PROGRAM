package com.String;

public class Question111 {
	
	public static void stringProgram(String str) {
		 String arr[] = str.split(" ");
		  
		  String requiredString = " ";
		  
		  for (int i = 0; i < arr.length; i++) { 
		
		  char c = arr[i].charAt(0);// i a g t s
		  
		  String c1 = String.valueOf(c).toUpperCase();
		  
		  String sub = arr[i].substring(1);
		  
		  requiredString =requiredString + c1 + sub + " ";
		}
		  System.out.println(requiredString.trim());
	}
	
	public static void main(String[] args) {
		stringProgram("i am going to school");
	}

}
