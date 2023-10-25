package array;

public class array_30 {
    // 30. 1 to n-1 in an array : 1 number is missing -> find out
    public static void main(String[] args) {
        int [] arr={1,2,4,5,6};
        int n= arr.length+1;
        int sum=(n*(n+1))/2, asum=0;
        for (int i=0; i<arr.length; i++){
            asum=asum+arr[i];
            }
        int missing=sum-asum;
        System.out.println(missing);
    }
}
