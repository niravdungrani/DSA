package basic;

public class fibonacci
{
    public static void main(String[] args)
    {
        int n = 8, a1 = 0, a2 = 1;

        for (int i = 1; i <= n; i++)
        {
            System.out.print(a1 + ",");

            int c = a1 + a2;
            a1 = a2;
            a2 = c;

        }
    }
}
