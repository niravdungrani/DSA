package basic;

public class prime
{
    public static void main(String[] args) {
        int n = 21;

        int c = 0;


        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("not basic.prime number");
                return;
            }
        }
        System.out.println("basic.prime number");
    }}


