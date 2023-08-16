package com.Oper;

public class TernaryOperator {

	public static void main(String[] args) {
		
		int a=10,b=20,c=30;int res;
		
		res=(a>b) ? (a>c ? a : b) : (b>c ? b : c);
		
		System.out.println(res);

	}

}
