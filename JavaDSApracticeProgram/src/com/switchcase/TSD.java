package com.switchcase;

import java.util.Scanner;

public class TSD {
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Press 1 if you want to know the distance::::");
			
			System.out.println("Press 2 if you want to know the time:::");
			
			System.out.println("Press 3 if you want to know the Speed:::");
			
			int d=sc.nextInt();
			switch (d) {
			case 1: {
				System.out.println("Enter Your Time::: ");
				int time=sc.nextInt();
				System.out.println("Enter Your Speed:::");
				int speed=sc.nextInt();
				float distance=speed*time;
				System.out.println(distance+"KM"+"This is your Distance");
				break;

			}
			case 2:{
				System.out.println("Enter Your Distance::");
				int distance=sc.nextInt();
				System.out.println("Enter Your Speed:::");
				int speed=sc.nextInt();
				float result=distance/speed;
				System.out.println(result+" Hr "+"");
				break;
			}
			case 3:{
				System.out.println("Enter Your Distance");
				float distance=sc.nextFloat();
				System.out.println("Enter Your Time");
				float time=sc.nextFloat();
				float result=distance*time;
				System.out.println(result+"km/hr ");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + d);
			}
		}
	}

}
