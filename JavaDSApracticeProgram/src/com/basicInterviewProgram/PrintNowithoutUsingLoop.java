package com.basicInterviewProgram;

public class PrintNowithoutUsingLoop {
	public static void printNo(int num) {
		if(num<=10) {
			System.out.println(num);
			printNo(num+1);
		}
	}
	public static void main(String[] args) {
		printNo(1);
		
	}

}
