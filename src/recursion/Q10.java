package recursion;
// 10.	check if a number is a prime number or not using recursion
public class Q10 {
    public static void main(String[] args) {
        int number = 22; //
        if (isPrime(number, 2)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static boolean isPrime(int n, int divisor) {
        // Base cases
        if (n <= 2) {
            return (n == 2);
        }
        if (n % divisor == 0) {
            return false;
        }
        if (divisor * divisor > n) {
            return true;
        }
        return isPrime(n, divisor + 1);
    }
}
