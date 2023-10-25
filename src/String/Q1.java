package String;

public class Q1 {
    //1. Reverse a String
    public static void main(String[] args) {
        String str="Helllo";
        int n=str.length();
        char[] charArray=str.toCharArray();
        int left=0;
        int right=n-1;
        while (left<right){
            char tepm=charArray[left];
            charArray[left]=charArray[right];
            charArray[right]=tepm;
            left++;
            right--;
        }
        str=new String(charArray);
        System.out.println(str);
    }
}
