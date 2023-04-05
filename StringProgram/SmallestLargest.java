package StringProgram;


public class SmallestLargest {
    public static void main(String[] args) {
        String string="Hardships often prepare ordinary people for an extraordinary destiny";

        String word="",small="",large="";

        String words[]=new String[100];

        int length=0;
        //add extra space after string to get the last word in the given string
        string = string+"";
        for(int i=0; i<string.length(); i++){
            if(string.charAt(i)!=' '){
                word=word+string.charAt(i);
            }
            else{
                //add word to array words
                words[length]=word;

                //increment length
                length++;
                //make word an empty string
                word="";
            }
        }
        //initialize small and large with first word in the string
        small=large=words[0];

        //determine smallest and largest word is the string 
        for(int k=0; k<length; k++){
            
            if(small.length()>words[k].length())
            small=words[k];

            if(large.length()<words[k].length())
            large=words[k];
        }
        System.out.println("smallest word:"+small);
        System.out.println("largest word:"+large);

    }
}
