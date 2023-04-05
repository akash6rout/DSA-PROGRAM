package StringProgram;

import java.util.*;
public class GetRefCodeArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR MOBILE NUMBER::");
        int size=sc.nextInt();
        int num[]=new int[size];

        for(int i=0; i<size;i++)
        {
            num[i]=sc.nextInt();
        }

        for(int i=0;i<num.length;i++){
            if(size==i){
            num[i]=size*2;
            }
        }
        System.out.println("ref is::"+num);
        
        
    }
}
