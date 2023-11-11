package com.numProgram;

public class AddDigit {
	
	public static int digitSumcalc(int num) {
		for(int i=0;i<=num;i++) {
			int digitsum=0;
			while(num!=0) {
				digitsum=digitsum+num%10;
				num=num/10;
			}
			num=digitsum;
		}
		return num;
	}

	public static void main(String[] args) {
		
		int num=38;
		int result=digitSumcalc(num);
		System.out.println(num);
		System.out.println(result);
	}
}
