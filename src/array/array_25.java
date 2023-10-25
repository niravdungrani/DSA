package array;

public class array_25 {
    // 25. Segregate even and odd numbers
    public static void main(String[] args) {
        int [] arr={1,4,5,6,9,12,13,15,20,21,22,25};

        int n = arr.length;
        int left=0,right=n-1;
        while (left<right){
            if (arr[left]%2==1){
                left++;
            } else if (arr[right]%2==0) {
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
