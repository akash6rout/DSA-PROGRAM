package StringProgram;

public class PrintOnlyVowel
	{
	public static void main(String args[])
		{
		String str="abcdefghijklmnopqrstuvwxyz";
	
		char c[]=str.toCharArray();
		
		System.out.println("TOTAL VOWELS ARE");
		
		int VowelsCount=0;
	
		for(int i=0; i<str.length(); i++)
			{
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
				{
				VowelsCount++;
				System.out.println(c[i]+"  ");
				}
				}
			System.out.println("Total Vowel is :"+VowelsCount);
			}
		}