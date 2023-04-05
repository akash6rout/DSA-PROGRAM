package StringProgram;

public class TotalNumOfChar
	{
	public static void main(String args[])
		{
		String str="abcdefghijklmnopqrstuvwxyz";
	
		char c[]=str.toCharArray();
	
		System.out.println("TOTAL CHARACTERS ARE:");
		
		int count=0;
		for(int i=1; i<=str.length(); i++)
			{
			count++;
			}
		System.out.println(count);
		}
	}