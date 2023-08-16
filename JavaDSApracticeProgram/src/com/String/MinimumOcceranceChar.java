package com.String;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class MinimumOcceranceChar {

	public static void main(String[] args) {
		String str = "aabbbcccdddeee";
		HashMap<Character, Integer> map = new HashMap<>();
		char chr[] = str.toCharArray();

		for (Character character : chr) {
			if (map.containsKey(character)) {
				int value = map.get(character);
				map.put(character, value + 1);
			} else {
				map.put(character, 1);
			}
		}
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		int minCount = 0;
		char minChar = 0;

		for (Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() < minCount) {
				minCount = entry.getValue();
				minChar = entry.getKey();
			}
		}
		System.out.println(minCount + " " + minChar);

	}

}
