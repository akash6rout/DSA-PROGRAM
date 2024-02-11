package com.numProgram;

public class FibonacciProg {

	public static void main(String[] args) {

		int no=10;
		int a=0;int b=1;int c;
		for(int i=1;i<=no;i++) {
			
			System.out.println(" "+a);
			c=a+b;
			a=b;
			b=c;
		}

	}

}
