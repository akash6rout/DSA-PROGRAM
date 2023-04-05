package StringProgram;

public class ReverseWordsOfSentense {

    public static String reverseWord(String str){
        String words[]=str.split(" ");
        String result=" ";

        for(int i=words.length-1; i>=0; i--){
            if(i==0){

                result=result+words[i];
            }else{
                result=result+words[i]+" ";
            }
        }
        return result;
    }



    public static void main(String[] args) {
        String str="Welcome to CloudTech";
        System.out.println(reverseWord(str));
        //"CloudTech to Welcome"

    }
}
