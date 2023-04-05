package StringProgram;


public class RevString {
    public static void main(String[] args) {
        String s="akaka";
        String r="";

        for(int i=s.length()-1;i>=0;i--){
            r=r+s.charAt(i);
        }
        System.out.println("rev is:"+r);
    }
}
