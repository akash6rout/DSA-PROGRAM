package com.String;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesString {

	public static void main(String[] args) {
		String str="aabbccddee";
		
		StringBuilder sb=new StringBuilder();
		
		Set<Character> set=new LinkedHashSet<>();
		
		for(int i=0; i<str.length(); i++)
		{
			set.add(str.charAt(i));
		}
		for(Character ch : set)
		{
			sb.append(ch);
		}
		System.out.println(set);
	}
	
}
