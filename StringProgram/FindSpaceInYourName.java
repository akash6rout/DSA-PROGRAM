package StringProgram;

public class FindSpaceInYourName {
    public static void main(String[] args) {
        String str="abc def ghijk lmnopqrstuvwxyz";

        int count=0;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)== ' ')
            {
                count++;
            }
        }
        System.out.println("space is:"+count);
    }
}
