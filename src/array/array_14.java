package array;

import java.util.Arrays;

public class  array_14 {
    // 14. Given an array arr, create another array arr2 with double the size of arr and copy arr element two times in arr2
    public static void main(String[] args){
        int[] arr1={1,2,3,4};
        int n=arr1.length;
        int[] arr2=new int[n*2];
//        int j=0;
        for(int i=0; i<n; i++){
            arr2[i]=arr1[i];  // for single loop - arr2[i+n]=arr1[i];
            arr2[i+n]=arr1[i];
            //j++;
            // System.out.print(arr2[i] +" ");

        }
//        for(int i=0; i<n; i++){
//            arr2[j]=arr1[i];
//            j++;
//            System.out.print(arr2[i] +" ");

        System.out.println(Arrays.toString(arr2));
    }
}
