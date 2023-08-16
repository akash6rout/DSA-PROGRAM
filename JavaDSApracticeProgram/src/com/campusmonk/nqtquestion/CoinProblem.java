package com.campusmonk.nqtquestion;

import java.util.Scanner;

public class CoinProblem {

	public static void main(String[] args) {
		
		try (Scanner s = new Scanner(System.in)) {
			int number=s.nextInt();
			int one=0,two=0;
			int five=(number-4)/5;
			
			if(((number-5*five)%2)==0)
			{
				one=2;
			}
			else
			{
				one=1;
			}
			two=(number-5*five-one)/2;
			
			System.out.print(one+two+five);
			System.out.print(five);
			System.out.print(two);
			System.out.print(one);
		}

	}

}
