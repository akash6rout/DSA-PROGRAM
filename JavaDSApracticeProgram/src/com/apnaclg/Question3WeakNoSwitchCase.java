package com.apnaclg;

import java.util.Scanner;

public class Question3WeakNoSwitchCase {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("Enter Weak No (1-7)");
			int weak=sc.nextInt();
			if(weak<=1&&weak>=8)
			{
				break;
			}
			switch(weak) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("You Have Entered Wrong No:");
			}
		} while (true);
	}
}
