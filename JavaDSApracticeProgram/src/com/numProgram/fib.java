package com.numProgram;

public class fib {
	
	public static void fibo(int num) {
		
		int a=0,b=1,c;
		
		for(int i=1;i<=num;i++) {
			System.out.println(" "+a);
			c=a+b;
			a=b;
			b=c;
		}
	}
	
	public static void main(String[] args) {
		
		fibo(10);
	}

}
