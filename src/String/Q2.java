package String;

public class Q2 {
    // 2. check if a String is Palindrome?
    public static void main(String[] args) {
        String str="racecar";
        int left=0;
        int right=str.length()-1;
        while (left<right){
            if (str.charAt(left)!=str.charAt(right)){
                System.out.println("Not pelindrome");
                return;
            }
            left++;
            right--;

        }
        System.out.println("pelindrome");
    }
}
