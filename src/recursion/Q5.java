package recursion;
//5.	Count the digits of a given number using recursion
public class Q5 {
    public static void main(String[] args) {
        int n=123456;
        System.out.println(countDigit(n));
    }

    private static int countDigit(int n) {
        if (n < 10) {
            return 1;
        } else {
            return 1 + countDigit(n / 10);
        }
    }
}
