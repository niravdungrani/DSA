package String;

public class Q13 {
    // 13. Check if all words are palindrome
    public static void main(String[] args) {
        String s="noon ";
        String[] ch=s.split(" ");
        String news="";
        for (String i:ch){
            i=revers(i);
            news=i+" ";
        }
        news=news.trim();
        s=s.trim();
        if (s.equals(news)){
            System.out.println("it is palindrome");
            return;
        }
        else {
            System.out.println("it is Not palindrome");
        }
    }

    private static String revers(String s) {

    String s1="";
    for (int i=s.length()-1;i>=0;i--){
        s1=s1+s.charAt(i);
    }
    return s1;
}
}
