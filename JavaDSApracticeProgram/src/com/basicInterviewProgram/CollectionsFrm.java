package com.basicInterviewProgram;

import java.util.ArrayList;

public class CollectionsFrm {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList=new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		
		for(int i:arrayList) {
			System.out.println(i);
		}

	}

}
