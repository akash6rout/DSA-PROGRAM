package StringProgram;

public class CapitalizeFirstLetterp3 {
    public static void main(String[] args) {
        String str="akash kumar rout";

        String arr[]=str.split(" ");

        String reqString=" ";

        for(int i=0;i<arr.length;i++)
        {
            char c=arr[i].charAt(0);

            String c1=String.valueOf(c).toUpperCase();

            String sub=arr[i].substring(1);

            reqString=reqString+c1+sub+" ";

        }
        System.out.println(reqString.trim());

    }
}
