package com.String;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MaximumOcceranceChars {

	public static void main(String[] args) {

		String str = "aabbbcddddde";

		HashMap<Character, Integer> map = new HashMap<>();
		char chr[] = str.toCharArray();

		for (Character character : chr) {
			if (map.containsKey(character)) {
				int value=map.get(character);
				map.put(character, value+1);
				
			} else {
				map.put(character, 1);
			}
		}
		Set<Entry<Character, Integer>> entrySet=map.entrySet();
		int maxCount=0;
		char maxChar=0;
		for(Entry<Character, Integer> entry: entrySet)
		{
			if(entry.getValue()>maxCount)
			{
				maxCount=entry.getValue();
				maxChar=entry.getKey();
			}
		}
	
		System.out.println(maxCount+":"+maxChar);

	}

}
