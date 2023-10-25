package array;

public class array_18 {
    // 18. Check if given number is duplicate or not
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};
        int v=7;
        int c=0;

        for(int i = 0; i < arr.length; i++) {
                if(arr[i] == v){
                    c++;
                }
                if (c==2){
                    System.out.println("duplicate");
                    return;
                }
            }

        System.out.println("not duplicate");

    }
}
