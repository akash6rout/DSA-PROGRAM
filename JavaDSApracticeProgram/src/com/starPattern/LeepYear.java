package com.starPattern;

import java.util.Scanner;

public class LeepYear {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int year=sc.nextInt();
		
		boolean x=(year%4)==0;
		boolean y=(year%100)!=0;
		boolean z=(year%100==0)&&(year%400==0);
		
		if(x && (y||z)) {
			System.out.println("is a leap year"+year);
		}else {
			System.out.println("is not a leap year"+year);
		}

	}

}
