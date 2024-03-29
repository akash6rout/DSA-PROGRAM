package com.sg;

public class PrintPrimeNumber1to100 {

	public static boolean isPrime(int n)
	{
		if(n<2)
		{
			return false;
		}
		
			for(int i=2; i<=n/2; i++)
			{
				if(n % i == 0)
				{
					return false;
				}
			}
			
		return true;
	}
	public static void main(String[] args) {
		for(int i=1; i<=100; i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
			}
		}
	}
}
