package com.basicInterviewProgram;

public class CheckPrimeOrNot {
	
	public static void main(String[] args) {
		
		int num=7;
		int count=0;
		boolean prime=true;
		for(int i=2;i<num;i++) {
			if(num%i==0)
			{
				prime=false;
			}
		}
		if(prime==true) {
			System.out.println("Prime No");
		}else {
			System.out.println("Not a Prime No");
		}
	}

}
