package StringProgram;

import java.util.Scanner;

public class GetRefNum {
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER TO GET REGISTRATION NUM");
        int num1=sc.nextInt();

        for(int i=1;i<=num1;i++){
            if(num1==i){
                num1=num1*2;
            }
        }
        System.out.println("YOUR REGISTRATION NUMBER IS::"+num1);
        
    }
}
