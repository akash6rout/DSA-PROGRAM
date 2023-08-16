package com.array;

public class PrintSubArray {
	public static void printSubArray(int numbres[])
	{
		int ts=0;
		for(int i=0;i<numbres.length;i++)
		{
			int start=i;
			for(int j=i;j<numbres.length;j++)
			{
				int end=j;
				for(int k=start;k<=end;k++)
				{
					System.out.print(numbres[k]+" ");
				}
				ts++;
				System.out.println();
			}
			System.out.println();
		}
		System.out.println(ts);
	}

	public static void main(String[] args) {
		int numbers[]= {2,4,6,8,10};
		printSubArray(numbers);

	}

}
