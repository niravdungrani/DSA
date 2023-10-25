package basic;

public class countdigit {
    public static void main(String[] args)
    {
        int n=698543, c=0;
        while (n>0)
        {
            n=n/10;
            c++;
        }
        System.out.println("Number of Digits :" + c);
    }

}
