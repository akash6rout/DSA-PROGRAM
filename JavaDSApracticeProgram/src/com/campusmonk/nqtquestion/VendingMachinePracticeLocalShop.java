package com.campusmonk.nqtquestion;

import java.util.Scanner;

public class VendingMachinePracticeLocalShop {
	
	public static String getSubMenuCoffee(int choice)
	{
		switch (choice){
		case 1 :
			return "Espresso Coffee";
		case 2:
			return "Cappuccino Coffee";
		case 3:
			return "Latte Coffee";
		default:
			return "";
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Deva Chai Stall!!");
		System.out.println(
				"Enter the first letter to select the main manu c for coffee,t for tea, b for biscuit,g for gift for girlfriend::");
		char mainManu = scanner.next().charAt(0);

		String subManu = "";

		switch (mainManu) {
		case 'c': 
			System.out.println("Enter the sub menu number (1: Espresso Coffee, 2: Cappuccino Coffee, 3: Latte Coffee): ");
			int coffeeChoice=scanner.nextInt();
			subManu=getSubMenuCoffee(coffeeChoice);
			break;
		default :
			System.out.println("Invalid Input");
			
		}if(!subManu.isEmpty())
		{
			System.out.println(subManu+"Enjoy your!!");
		}
		scanner.close();
		
	}
}
