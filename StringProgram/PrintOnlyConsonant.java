package StringProgram;

public class PrintOnlyConsonant
	{
	public static void main(String args[])
		{
		String str="abcdefghijklmnopqrstuvwxyz";
		
		char c[]=str.toCharArray();
		
		System.out.println("CONSONANT ARE :");
		
		int consonantCount=0;
		
		for(int i=0; i<str.length(); i++)
			{
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
				{
				continue;
				}else if(c[i]>='a' && c[i]<='z')
					{
					consonantCount++;
					}
			System.out.println(c[i]+"  ");
				}
			System.out.println("TOTAL IS :"+consonantCount);
			
			
			}
		}
