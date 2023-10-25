package String;

public class Q7 {
    // 7. Print frequency of all the characters in string
    public static void main(String[] args) {
        String str="Hello Nirav";
        int[] arr=new int[128];
        for (int i=0;i<str.length();i++){
            int ascii=str.charAt(i);
            arr[ascii]=arr[ascii]+1;
        }
        for (int j=0;j<arr.length;j++){
            if (arr[j]>0){
                System.out.println((char)j+" "+arr[j]);
            }
        }
    }
}
