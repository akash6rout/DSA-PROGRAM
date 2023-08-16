package com.campusmonk.nqtquestion;

import java.util.Scanner;

public class AutomobileComp {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter No of vehicles");
			int v=sc.nextInt();
			System.out.println("Enter No of Wheels");
			int w=sc.nextInt();
			float res=((4*v)-w)/2;
			if(w>=2 && (w%2==0) && v<w)
			{
				System.out.println("TW= "+(int)(res)+"FW= "+(int)(v-res));
			}else
			{
				System.out.println("INVALID INPUT");
			}
		}

	}

}
