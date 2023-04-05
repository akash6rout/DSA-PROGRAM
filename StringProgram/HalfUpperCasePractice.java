package StringProgram;

public class HalfUpperCasePractice {
    public static void main(String[] args) {
        String str="abcdefghijklmnopqrstuvwxyz";

        int mid=str.length()/2;

        String lowercase=" ";

        String UpperCase=" ";

        for(int i=0; i<str.length();i++)
        {
            if(i<mid)
            {
                lowercase=lowercase+Character.toLowerCase(str.charAt(i));
            }
        }
        System.out.println(lowercase);
    }
}
