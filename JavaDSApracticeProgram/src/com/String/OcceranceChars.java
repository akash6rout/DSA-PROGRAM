package com.String;

import java.util.HashMap;
import java.util.Map;

public class OcceranceChars {

	public static void main(String[] args) {
		
		String str="hheelloo";
		
		Map<Character, Integer> map=new HashMap<>();
		
		char[] ch=str.toCharArray();
		
		for(Character chr : ch)
		{
			if(!map.containsKey(chr))
			{
				map.put(chr, 1);
			}
			else
			{
				int value=map.get(chr);
				map.put(chr, value+1);
			}
		}
		System.out.println(map);
	}

}
