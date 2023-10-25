package array;

public class array_26 {
    // 26. Find element -> simple and binary search
    public static void main(String[] args){
            int[] arr= {2,6,10,15,20,35,45,56};
            int n=arr.length;
            int left=0, right=n-1;
            int value=56;

            while(left<=right){
                int mid=(left+right)/2;
                if (arr[mid]== value){
                    System.out.println("present At index :  "+ mid);

                    return;
                } else if (arr[mid]<value) {
                    left=mid+1;

                }
                else {
                    right=mid-1;
                }
            }
            if (left>right){
                System.out.println("not present");
            }
    }
}
