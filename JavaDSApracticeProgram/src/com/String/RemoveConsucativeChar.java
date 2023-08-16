package com.String;

public class RemoveConsucativeChar {
	
	//String S="aabb";
	
	 public static String removeConsecutiveCharacter(String S){
	      
		 String ans="";
		 	char c[]=S.toCharArray();
	        
	        for(int i=1; i<S.length();i++)
	        {
	        	if(S.charAt(i)!=S.charAt(i-1))
	        	{
	        		ans+=S.charAt(i-1);
	        	}
	        }
	        ans+=c[S.length()-1];
			return ans;
	        
	    }

	public static void main(String[] args) {
		
		//String S="aabb";
		String S="aabaa";
		
		String s=removeConsecutiveCharacter(S);
		
		System.out.println(s);

	}

}
