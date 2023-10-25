package basic;

public class factorial {
    public static void main(String[] args)
    {
        int n=4,f=1;
        while (n>0){
            f=f*n;
            n--;
        }
        System.out.println(f);
    }
}
