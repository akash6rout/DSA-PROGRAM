package com.basicInterviewProgram;

public class WithoutloopPrint1to10 {
	
	public static void printNo(int n) {
		if(n==1) {
			System.out.print(n+" ");
			return;
		}
		printNo(n-1);
		System.out.print(n+" ");
	}
	public static void main(String[] args) {
		int n=10;
		printNo(n);
		
	}

}
