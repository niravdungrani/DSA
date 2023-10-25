package array;

public class array_11 {
    // 11. Store array in reverse order in new array
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] newArr = new int[arr.length];

        int j= arr.length-1;
        for (int i=0; i < arr.length; i++) {
            newArr[j] = arr[i];
            j--;
        }
        for (int i=0; i<arr.length; i++)
        {
        System.out.print(newArr[i]+" ");
    }
    }
    }

