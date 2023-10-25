package array;

public class array_22 {
    // 22. How Many Numbers Are Smaller Than the Current Number
    public static void main(String[] args) {
        int [] arr={2,4,7,3,1,5,6,8};
        int [] arr2=new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[j] < arr[i]){
                    count++;
                    arr2[i] = count;
                }
            }
        }
        for (int i=0; i<arr2.length; i++){
            System.out.print(" "+arr2[i]);
        }
    }
}
