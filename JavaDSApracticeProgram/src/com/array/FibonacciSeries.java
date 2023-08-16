package com.array;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int a=0,b=1,c;
		int num=5;
		for(int i=0;i<=num;i++)
		{
			c=a+b;
			System.out.println(c+"");
			a=b;
			b=c;
		}
		

	}

}
