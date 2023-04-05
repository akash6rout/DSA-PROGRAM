public class PrintSmallestElement {
    public static void main(String[] args) {
        int arr[]=new int[]{10,20,30,40,50,60};

        int min=arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]<min)
            min=arr[i];
        }
        System.out.println(min);
    }
}
