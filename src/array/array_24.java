package array;

public class array_24 {
    // 24. Find 3rd largest element from array
    public static void main(String[] args) {
        int [] arr={10,40,70,80,90,20,30,90,80,70};

        int max1= Integer.MIN_VALUE,max2= Integer.MIN_VALUE,max3= Integer.MIN_VALUE;

        if (arr.length<=2){
            System.out.print("not enough element");
            return;
        }
        for (int i=0; i<arr.length; i++){
            if (arr[i]>max1){
                max3=max2;
                max2=max1;
                max1=arr[i];
            } else if (arr[i]>max2 && arr[i]!=max1) {
                max3=max2;
                max2=arr[i];
            } else if (arr[i]>max3 && arr[i]!=max2 && arr[i]!=max1) {
                max3=arr[i];
                
            }
        }
        System.out.println(max3);

    }
}
