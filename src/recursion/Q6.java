package recursion;
//6.	reverse an integer number using recursion
public class Q6 {
    public static void main(String[] args) {
        int n=12345;
        reversNum(n);
    }

    private static void reversNum(int n) {
        if (n==0){
            return ;
        }
        System.out.print(n%10+" ");
        reversNum(n/10);
    }
}
