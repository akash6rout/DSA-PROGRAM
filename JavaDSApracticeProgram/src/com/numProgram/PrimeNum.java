package com.numProgram;

public class PrimeNum {
	public static void isPrime(int number) {
		int count=0;
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("No is Prime");
		}
		else {
			System.out.println("no is not prime");
		}
	}

	public static void main(String[] args) {
		
		int number=7;
		isPrime(number);
	}

}
