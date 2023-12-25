package com.basicInterviewProgram;

import java.util.Scanner;

public class RevStringWithoutLoop {
	public static void reverseString(char ch[],int length) {
		if(length>0) {
			System.out.print(ch[length-1]);
			length--;
			//recursive calling method
			reverseString(ch, length);
		}
	}
	
	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a String");
			String string=scanner.nextLine();
			char ch[]=string.toCharArray();
			int length=ch.length;
			reverseString(ch, length);
		}
	}

}
