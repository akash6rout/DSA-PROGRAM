public class CopyoneElementToAnathorArray {
    public static void main(String[] args) {
        int arr1[]=new int[]{1,2,3,4,5};
        //create another array arr2 with size of arr1
        int arr2[]=new int[arr1.length];
        //copying all elements of one array into another
        for(int i=0;i<arr1.length;i++){
            arr2[i]=arr1[i];
        }
        //displaying elements of array arr1
        System.out.println("elements of original array::");
        for(int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]+" ");
        }
        System.out.println();
        //Displaying elements of array arr2
        System.out.println("elements of new array::");
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]+" ");
        }
    }
}
