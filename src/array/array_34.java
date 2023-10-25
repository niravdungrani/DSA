package array;

import java.util.Arrays;

public class array_34 {
    // 34. Merge two sorted array
    public static void main(String[] args) {
        int[] arr1={1,2,5};
        int[] arr2={2,5,7,8,9,15,20};
        int n=arr1.length;
        int m=arr2.length;
        int[] arr3=new int[n+m];

        int i=0,j=0;
        int k=0;
        while(i<n && j<m){
            if (arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;

            }
//            else if (arr1[i]==arr2[j]){
//                arr3[k]=arr1[i];
//                i++;
//                j++;
//                k++;
//            }
        else{
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        }
        while (i<n){
            arr3[k]=arr1[i];
            i++;
            k++;
        }
        while (j<m){
            arr3[k]=arr2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
