package com.String;

import java.util.Arrays;

public class IfcharOccurThenReplace {

	public static void main(String[] args) {
		String input="opentext";
		char cartoreplace='t';//expected output=open1ex2
		
		if(input.indexOf(cartoreplace) == -1)
		{
			System.out.println("GIVEN CHAR IS NOT AVILABLE IN STRING");
			System.exit(0);
		}
		//logic to replace char occurance in string
		char[] err=input.toCharArray();
		int count=1;
		for(int i=0; i<err.length; i++)
		{
			if(err[i] == cartoreplace)
			{
				err[i]=String.valueOf(count).charAt(0);
				count++;
			}
		}
		System.out.println(Arrays.toString(err));

	}

}
