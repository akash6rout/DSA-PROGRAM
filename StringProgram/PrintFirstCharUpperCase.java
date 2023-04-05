package StringProgram;

public class PrintFirstCharUpperCase {
    public static void main(String[] args) {
        String str="i am java student";

        String arr[]=str.split(" ");
        for(int i=0; i<=str.length();i++)
        {
            char c=arr[i].charAt(0);

            String sub=arr[i].substring(1);

            System.out.print((char)(c-32)+sub);
        }
        
    }
}
