package recursion;
//3.	Sum of 1 to n numbers
public class Q3 {
    public static void main(String[] args) {
    System.out.println(fact(5));
}

    private static int fact(int n) {
        if (n==0||n==1){
            return 1 ;
        }else{
            return n+fact(n-1);
        }
    }
}
