package recursion;
//7.	calculate the product of two numbers using recursion
public class Q7 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        System.out.println(multiply(num1,num2));
    }
    public static int multiply(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        }

        return num1 + multiply(num1, num2 - 1);
    }
}
