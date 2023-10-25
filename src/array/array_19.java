package array;

public class array_19 {
    // 19. Check if given number is unique or not
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,4,2};
        int v=3;
        int c=0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == v){
                c++;
            }
            if (c==2){
                System.out.println("not unique");
                return;
            }
        }

        System.out.println("not unique");


    }
}
