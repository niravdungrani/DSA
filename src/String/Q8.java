package String;

public class Q8 {
    // 8. Remove Vowels from a String
    public static void main(String[] args) {
        String str="Hii, My Name is nirav";
        String newstr=" ";
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
            {
                continue;
            }
            newstr=newstr+str.charAt(i);
        }
        System.out.println(newstr);
    }
}
