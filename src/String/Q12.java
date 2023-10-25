package String;

public class Q12 {
    // 12. Merge Strings Alternatively
    public static void main(String[] args) {
        String s1="hello";
        String s2="nirav";
        int n=s1.length();
        int n2=s2.length();
        String result="";
        for (int i=0;i<n||i<n2;i++){
            result=result+s1.charAt(i);
            result=result+s2.charAt(i);
        }
        System.out.println(result);
    }
}
