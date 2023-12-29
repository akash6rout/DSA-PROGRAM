package com.basicInterviewProgram;

import java.util.Arrays;

public class SortingChar {

	public static void main(String[] args) {
		String str="java";
		char ch[]=str.toCharArray();
		Arrays.sort(ch);
		String sortedStr=new String(ch);
		System.out.println(sortedStr);
	}
}
