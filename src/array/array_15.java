package array;

public class array_15 {
   // 15. Given an array arr, create another array arr2 with double the size of arr, create another array arr2 with all value twice

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = new int[arr1.length*2];
        int j=0;
        for (int i=0; i<arr1.length; i++) {
            arr2[j] = arr1[i];
            j++;

            arr2[j] = arr1[i];
            j++;
        }
        for (int i=0; i<arr2.length; i++) {
            System.out.print(arr2[i] + " ");

        }
        }
}
