package array;

public class array_6 {
    // Print nth element from last
    public static void main (String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n=4;
        int index = arr.length-n;
        System.out.println(arr[index]);
//        for(int i=arr.length-1; i>=0; i--)
//        {
//            if (n == arr.length - i){
//                System.out.println(arr[i]);
//            }
//        }

    }
}
