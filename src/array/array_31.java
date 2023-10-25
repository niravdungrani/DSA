package array;

public class array_31 {
    // 31. 1 to n in an array : 1 number is duplicate -> find out
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,4};
        int n=arr.length-1;
        int sum=(n*(n+1))/2, asum=0;
        for (int i=0; i<arr.length; i++){
            asum=asum+arr[i];
        }
        int duplicate=asum-sum;
        System.out.println(duplicate);
    }
}
