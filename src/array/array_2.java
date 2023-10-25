package array;

public class array_2 {
    // Find average of all the element of array
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6};

        int n = arr.length;

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }

        double average = sum / n;

        System.out.println("Average of array : "+average);

    }


}
