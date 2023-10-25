package array;

import java.util.Arrays;

public class selection_sort {
    // Selection Sort
    public static void main(String[] args) {
        int [] arr={5,8,6,9,15,0,11,3,4,2};
        for (int i=0;i< arr.length-1;i++){
            int minindex=i;
            for (int j=i+1;j< arr.length;j++){
                if (arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            if (i!=minindex){
                int temp=arr[i];
                arr[i]=arr[minindex];
                arr[minindex]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
