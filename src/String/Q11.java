package String;

public class Q11 {
    // 11. remove All Digits

    public static void main(String[] args) {
        String str="hii my number is 9567 and addrs at 18";
        str=str.replaceAll("[0-9]","");
        System.out.println(str);
    }
}
