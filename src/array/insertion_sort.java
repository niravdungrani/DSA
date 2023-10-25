package array;

import java.util.Arrays;

public class insertion_sort {
    // Insertion Sort
    public static void main(String[] args) {
        int [] arr={5,8,6,9,15,0,11,3,4,2};


        for (int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            for (;j>=0&&arr[j]>temp;j--){
                arr[j+1]=arr[j];
            }
            arr[j+1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
