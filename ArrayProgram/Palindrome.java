import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER::");
        int num=sc.nextInt();
        int rem=0,rev=0;
        //int num=454;
        int temp=num;
        while(num>0){
            rem = num % 10;

            rev = (rev*10)+rem;

            num = num/10;
        }
        if(temp == rev){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrom");
        }
    }
}
