package com.sg;

public class Recursion {

	public static void main(String[] args) {
		
		Recursion r=new Recursion();
		int n=r.sum(20);
		System.out.println(n);
		
	}
	
	int sum(int b)
	{
		if(b>0)
		{
			return b+sum(b-1);
		}
		else
		{
			return 0;
		}
	}

}
