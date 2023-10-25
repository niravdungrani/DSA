package array;

public class array_35 {
    // 35. Largest contiguous sum
    public static void main(String[] args) {
        int [] arr={-2,4,5,-8,20,5,-4,6};
        int max1= Integer.MIN_VALUE;
        int max2=0;
        for (int i=0;i<arr.length;i++){
            max2=max2+arr[i];
            if (max1<max2){
                max1=max2;
            }
            if (max2<0){
                max2=0;
            }

        }
        System.out.println(max1);
    }
}
