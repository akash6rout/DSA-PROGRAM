package StringProgram;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        String str = "i am going to school";

        String arr[] = str.split(" ");

        String reqStr = " ";
        
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i].charAt(0);

            String c1 = String.valueOf(c).toUpperCase();

            String sub = arr[i].substring(1);

            reqStr = reqStr + c1 + sub + " ";

        }
        System.out.println(reqStr.trim());
    }
}
