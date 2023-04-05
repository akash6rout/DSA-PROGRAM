public class RotateArray {
    public static void main(String[] args) {
        int arr[]=new int[]{10,20,30,40,50};

        int n=3;

        System.out.println("original array::");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
        for(int i=0; i<n; i++){
            int j,last;

            //store the last element of array
            last=arr[arr.length-1];

            for(j=arr.length-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=last;
        }
        System.out.println();
        //display resulting array rotation
        System.out.println("array after right rotation::");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
