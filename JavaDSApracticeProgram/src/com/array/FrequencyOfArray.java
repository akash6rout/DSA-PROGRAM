package com.array;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfArray {

	public static void main(String[] args) {
		int arr[]= {10,50,40,30,60,10,20,50,40};
		
		Map<Integer, Integer> map=new HashMap<>();
		
		for(Integer no : arr)
		{
			if(!map.containsKey(no))
			{
				map.put(no, 1);
			}
			else {
				int value=map.get(no);
				map.put(no, value+1);
			}
		}
		System.out.println(map);
	}
}
