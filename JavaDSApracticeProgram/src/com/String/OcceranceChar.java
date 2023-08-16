package com.String;

import java.util.HashMap;
import java.util.Map;

public class OcceranceChar {

	public static void main(String[] args) {
		String str="hello";
		
		Map<Character, Integer> map=new HashMap<>();
		
		char[] input=str.toCharArray();
		
		for(Character ch : input)
		{
			if(!map.containsKey(ch))
			{
				map.put(ch, 1);
			}
			else
			{
				int value=map.get(ch);
				map.put(ch, value+1);
			}
		}
		System.out.println(map);
	}
}
