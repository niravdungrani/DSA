package array;

public class array_28 {
    // 28. Move all 0 to right and 1s to left
    public static void main(String[] args){
      int [] arr={0,1,0,0,0,1,1,0,1,0,1,1};

        int n = arr.length;
        int left=0,right=n-1;
        while (left<right){
            if (arr[left]==1){
                left++;
            } else if (arr[right]==0) {
                right--;
            }
            else {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        for (int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
