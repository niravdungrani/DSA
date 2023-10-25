package recursion;
//9.	get the largest element of an array using recursion
public class Q9 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 7, 20, 15};
        int n = arr.length;

        System.out.println(findLargest(arr, n));
    }
    public static int findLargest(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }

        int subarrayMax = findLargest(arr, n - 1);

        return Math.max(subarrayMax, arr[n - 1]);
    }
}
