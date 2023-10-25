package basic;

public class reverse_numb {
    public static void main(String[] args) {
        int n=123456;
        int a,ans=0;
        while(n>0)
        {
            a=n%10;
            ans=(ans*10)+a;
            n=n/10;
        }
        System.out.println(ans);
    }


}
