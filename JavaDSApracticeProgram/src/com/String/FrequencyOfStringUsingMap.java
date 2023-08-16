package com.String;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfStringUsingMap {
		
	public static void main(String[] args) {
		
		String str="aakkaasshh";
		Map<Character, Integer> map=new HashMap<>();
		char ch[]=str.toCharArray();
		
		for(Character chr:ch)
		{
			if(map.containsKey(chr))
			{
				int value=map.get(chr);
				map.put(chr, value+1);
			}else {
				map.put(chr, 1);
			}
		}
		System.out.println(map);

	}

}
