package array;

public class array_9 {
    // 9. Find largest (maximum) element from array
    public static void main(String[] args) {
        int[] arr = {15, 29, 36,99,451, 54, 67, 77};
        int larg=0 ;

        for(int i=0; i<arr.length; i++)
        {
            if(larg < arr[i])
            {
                larg = arr[i];
            }
        }
        System.out.print(larg);
    }
}
