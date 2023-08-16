package com.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateArray {

	public static void main(String[] args) {
	
		int arr[]= {9,8,7,45,12,1,1,1,2,2,9};
		
		Map<Integer, Integer> hm=new HashMap<>();
		for(int no:arr)
		{
			Integer count=hm.get(no);
			if(count==null)
			{
				hm.put(no, 1);
			}
			else
			{
				count=count+1;
				hm.put(no, count);
			}
		}
		System.out.println("Duplicate Element are");
		Set<Map.Entry<Integer, Integer>> es=hm.entrySet();
		for (Map.Entry<Integer, Integer> entry : es) {
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey());
			}
		}
	}
	
}
