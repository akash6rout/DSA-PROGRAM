package StringProgram;

public class LowerCaseToUpperCase
	{
	public static void main(String args[])
		{
		String str="I LOVE MY INDIA";
			
		StringBuffer rev=new StringBuffer(str);
		
		for(int i=0; i<str.length(); i++)
			{
			if(Character.isLowerCase(str.charAt(i)))
				{
				rev.setCharAt(i,Character.toUpperCase(str.charAt(i)));
				}
			else if(Character.isUpperCase(str.charAt(i)))
				{
				rev.setCharAt(i,Character.toLowerCase(str.charAt(i)));
				}
			}
		System.out.println("String after case conversion:"+rev);
			}
		}
				