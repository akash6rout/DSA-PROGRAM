package StringProgram;

import java.util.*;

public class TotalNumOfChar2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A SENTENSE");
        String str=sc.nextLine();
        
        char c[]=str.toCharArray();

        int count=0;

        for(int i=1; i<=str.length(); i++)
        {
            count++;
        }
        System.out.println("TOTAL NUMBER OF CHAR IS:"+count);

    }
}
