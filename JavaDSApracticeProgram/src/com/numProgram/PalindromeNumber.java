package com.numProgram;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int rev=0,rem=0;
		int num=414;
		
		int temp=num;
		
		while(num>0) {
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		if(temp==rev) {
			System.out.println("palindrome number");
		}else {
			System.out.println("not a palindrome number");
		}

	}

}
