public class PrintEvenPosition {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5};

        System.out.println("Element of given array present on even position:");
        //LOOP THROUGH THE ARRAY BY INCREMENTING VALUE OF i BY 2
        //HERE I WILL START FROM 1 AS FIRST EVEN POSITIONED ELEMENT IS PRESENT AT POSITIION1.
        for(int i=1; i<arr.length;i=i+2)
        {
            System.out.println(arr[i]);
        }
    }
}
