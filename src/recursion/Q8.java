package recursion;
// 8.	find the sum of digits of a number using recursion
public class Q8 {
    public static void main(String[] args) {
        int number = 12345;
        System.out.println(sumOfDigits(number));
    }

    public static int sumOfDigits(int n) {
        if (n < 10) {
            return n;
        } else {
            int lastDigit = n % 10;
            int remainingDigits = n / 10;
            int sumOfRemaining = sumOfDigits(remainingDigits);
            return lastDigit + sumOfRemaining;
        }
    }
}

