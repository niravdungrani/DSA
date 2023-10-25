package array;

public class array_27 {
    // 27. Pair with sum present or not? Two pointers
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int sum=20;
        int left=0, right=arr.length-1;
        while (left<right)
        {
            int pair=arr[left]+arr[right];
            if (pair==sum)
            {
                System.out.println(arr[left]+" , "+ arr[right]);

                return;
            } else if (pair>sum)
            {
                right--;
            }
            else if (pair<sum)
            {
                left++;
            }
        }
        System.out.println("pair is not present at" );
    }
}
