package basic;

public class palindrom
{
    public static void main(String[] args)

    {
        int n=51215, a,ans=0,t=n;

                while(n>0)
                {
                    a=n%10;
                    ans=(ans*10)+a;
                    n=n/10;
                }
                if(t==ans)
                    System.out.println("basic.palindrom number");
                else
                    System.out.println("Not basic.palindrom number");

    }
}
