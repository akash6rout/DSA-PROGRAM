package StringProgram;

public class CountVowel {
    public static void main(String[] args) {
        String str="abcdefghijklmnopqrstuvwxyz";

        char c[]=str.toCharArray();

        int count=0;
        for(int i=1; i<str.length(); i++)
        {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
            {
                count++;
            }

        }
        System.out.println("TOTAL VOWELS ARE ::::"+count);
    }
}
