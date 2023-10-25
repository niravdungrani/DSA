package basic;

public class reverse_int {
    public static void main(String[] args)
    {
        int n = 123456, ans = 0;
        while(n > 0)
        {
            int r = n % 10;
            ans = ans * 10 + r;
            n = n/10;
        }
        System.out.println(ans);
    }
}
