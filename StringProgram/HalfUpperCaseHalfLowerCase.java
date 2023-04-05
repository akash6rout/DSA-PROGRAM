package StringProgram;

public class HalfUpperCaseHalfLowerCase
	{
	public static void main(String args[])
		{
		String str="abcdefghijklmnopqrstuvwxyz";
		
		int mid=str.length()/2;

		String LowerCase=" ";
		
		String UpperCase=" ";
	
		for(int i=0; i<str.length(); i++)
			{
			if(i<mid)
				{
				LowerCase=LowerCase+Character.toLowerCase(str.charAt(i));
				}else{
				UpperCase=UpperCase+Character.toUpperCase(str.charAt(i));
				}
			}
		System.out.println(LowerCase+UpperCase);
			}
		}
