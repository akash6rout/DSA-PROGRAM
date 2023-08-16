package com.sg;

public class FindSum {
	
	public static int findSum(int n)
	{
		return n*(n+1)/2;
	}

	public static void main(String[] args) {
		
		int n=findSum(20);
		System.out.println(n);
		
	}

}
