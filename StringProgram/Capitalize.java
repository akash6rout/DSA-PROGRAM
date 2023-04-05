package StringProgram;

public class Capitalize {
    public static void main(String[] args) {
        String s="i am going to school";
        String[] arr=s.split(" ");
        String str=" ";
        for(int i=0;i<arr.length;i++)
        {
            char c=arr[i].charAt(0);
            String c1=String.valueOf(c).toUpperCase();
            String sub=arr[i].substring(1);
            str=str+c1+sub+" ";
        }
        System.out.print(str.trim());
    }
}
