package String;

public class Q4 {
    // 4. Program to check if two strings are same or not (without using inbuilt function
    //.equals())
    public static void main(String[] args) {
        String s1="Hello";
        String s2 ="Hello";
        char[] chars1=s1.toCharArray();
        char[] chars2=s2.toCharArray();
        int count=0;
        if (s1.length()==s2.length()){
            for (int i=0;i<s2.length();i++){
                if (chars1[i]!=chars2[i]){
                    count=1;
                    break;
                }
            }
        }
        else {
            count=1;
        }
        if (count==0){
            System.out.println("String are equal");
        }
        else {
            System.out.println("String are Not equal");
        }

    }
}
