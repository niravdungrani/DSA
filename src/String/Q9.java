package String;

public class Q9 {
    // 9. Reverse Words internally in a String
    public static void main(String[] args) {
        String str="Hello My Name is Nirav";
        char[] charArray=str.toCharArray();
        int left=0;
        int right=0;
        for (int i=0;i<charArray.length;i++){
            if (charArray[i]==' '){
                right=i-1;
                reversWord(charArray,left,right);
                left=i+1;
            }
        }
        right=charArray.length-1;
        reversWord(charArray,left,right);
        str=new String(charArray);
        System.out.println(str);
    }

    private static void reversWord(char[] charArray, int left, int right) {
        while (left<right){
            char temp=charArray[left];
            charArray[left]=charArray[right];
            charArray[right]=temp;
            left++;
            right--;
        }
    }
}
