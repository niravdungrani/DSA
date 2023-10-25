package array;

public class array_13 {
    // 13. Reverse an array in memory
    public static void main(String[] args){

        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++; right--;
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }

    }

}
