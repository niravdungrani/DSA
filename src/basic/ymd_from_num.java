package basic;

public class ymd_from_num {
    public static void main(String[] args) {
        int n=650;
        int y=n/365;
        n= n%365;
        int m=n/30;
        int d=n%30;
        System.out.println("Year: "+y+" "+"Month: "+m+" "+"Day:"+d);
    }
}
