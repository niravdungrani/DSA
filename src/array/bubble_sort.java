package array;

import java.util.Arrays;

public class bubble_sort {
//         Bubble Sort
    public static void main(String[] args) {
        int [] arr={5,8,6,9,15,0,11,3,4,2};
        int n= arr.length;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
