public class PrintReverseArray {
    public static void main(String[] args) {
        //initialize array
        int arr[]=new int[]{1,2,3,4,5};
        System.out.println("ORIGINAL ARRAY");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();

        System.out.println("ARRAY IN REVERSE ORDER");
        //LOOP THROUGH THE ARRAY IN REVERSE ORDER
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }

    }
}
