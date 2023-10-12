package com.apnaclg;

import java.util.Scanner;

public class ConditionalStatementQuestion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int a=sc.nextInt();
		String type=(a%2==0)? "Positive Number":"Negetive Number";
		System.out.println(type);

	}

}
