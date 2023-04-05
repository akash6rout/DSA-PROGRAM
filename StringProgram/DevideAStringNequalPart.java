package StringProgram;

public class DevideAStringNequalPart {

    public static void main(String[] args) {
        
        String str="aaabbbccc";

        int len=str.length();

        int n=3;

        int temp=0,chars=len/n;//14/2=7

        String equalstr[]=new String[n];

        if(len%n!=0)
        {
            System.out.println("sorry the string cannot be divided into"+n+"equal part");
        }
        else{
            for(int i=0;i<len;i=i+chars){
                String part=str.substring(i, i+chars);
                equalstr[temp]=part;
                temp++;

            }
            System.out.println(n+"equal part of given string are::");
            for(int i=0;i<equalstr.length; i++){
                System.out.println(equalstr[i]);
            }
        }
    }
}
