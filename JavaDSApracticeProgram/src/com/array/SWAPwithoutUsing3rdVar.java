package com.array;

public class SWAPwithoutUsing3rdVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;
		System.out.println("BEFORE"+a+" "+b);
		a=a+b;//10+20=30
		b=a-b;//20-30=10
		a=a-b;//30-10=20
		
		System.out.println("AFTER"+a+" "+b);
	}

}
