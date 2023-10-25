package array;

import java.util.Arrays;

public class array_10 {
    // 10. Copy array element in another array
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] newArr = new int[arr.length];


        for (int i = 0; i < arr.length; i++)
        {
            newArr[i]=arr[i];
        }
        System.out.println(Arrays.toString(newArr));
        }
    }
