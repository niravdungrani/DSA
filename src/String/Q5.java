package String;

public class Q5 {
    // 5. Update a character in a string (without using .replace() function)
    public static void main(String[] args) {
        String str="Hello nirav";
        char[] str1=str.toCharArray();
        char oldchar='a', newchar='o';
        for (int i=0;i<str.length();i++){
            if (str1[i]==oldchar){
                str1[i]=newchar;
            }
        }
        str=new String(str1);
        System.out.println(str);
    }
}
