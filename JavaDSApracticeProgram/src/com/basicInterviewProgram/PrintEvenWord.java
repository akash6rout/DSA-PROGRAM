package com.basicInterviewProgram;

public class PrintEvenWord {

	public static void main(String[] args) {
		
		String str="Hell World We lol";
		
		for(String s:str.split(" ")) {
			if(s.length()%2==0) {
				System.out.println(s);
			}
		}
	}
}
