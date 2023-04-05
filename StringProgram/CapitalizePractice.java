package StringProgram;

public class CapitalizePractice {
    public static void main(String[] args) {
        String s="i am going to school";
        String arr[]=s.split(" ");
        String reqString=" ";

        for(int i=0;i<arr.length;i++)
        {
            char c=arr[i].charAt(0);
            String c1=String.valueOf(s).toUpperCase();
            String sub=arr[i].substring(1);
            reqString=reqString+c1+sub+" ";
        }
        System.out.println(reqString.trim());
    }
}
