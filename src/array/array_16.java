package array;

public class array_16 {
    // 16. Arr1, arr2 same size -> arr3 alternative
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};
        int[] arr3 = new int[arr1.length+arr2.length];
        int n=arr1.length;
        int j=0;
        for (int i=0; i<n; i++){
            arr3[j]=arr1[i];
            j++;
            arr3[j]=arr2[i];
            j++;
        }
        for (int i=0; i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }

    }
}
