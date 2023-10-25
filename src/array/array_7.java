package array;

public class array_7 {
    // Print alternate elements from array
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        int n=arr.length;
        for(int i=0; i<n;i=i+2)
        {
            System.out.print(arr[i] + " ");
        }

    }
}
