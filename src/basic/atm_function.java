package basic;

public class atm_function {
    public static void main(String[] args)
    {
        int balance=0;
        balance = deposit(balance, 5000);
        System.out.println(balance);
        balance = withdraw(balance, 2000);
        System.out.println(balance);

    }
    private static int deposit (int b, int amt)
    {
        b=b+amt;
        return b;
    }
    private static int withdraw (int b , int amt){
        b=b-amt;
        return b;
    }
    private static void print(int b){
        System.out.println(b);
    }

}
