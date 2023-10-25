package array;

public class array_8 {
    // 8. Print odd elements first then even elements from array
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 1) {
                System.out.print(arr[i]+" ");
            }
        }
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                System.out.print(arr[i]+" ");
            }
        }

    }
}