package recursion;
//1.	Infinite recursive function
public class Q1 {
    public static void main(String[] args) {
        printHello();
    }

    private static void printHello() {
        System.out.println("hello");
        printHello();
    }
}
