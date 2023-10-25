package basic;

public class power
{
    public static void main(String[] args)
    {
        int n=2, p=8, ans=1;
        while(p>0)
        {
            ans=ans*n;
            p--;
        }
        System.out.println(ans);
    }
}
