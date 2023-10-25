package String;

public class Q6 {
    // 6. Sort string of characters
    public static void main(String[] args) {
        String str="hellonirav";
        char[] arr=str.toCharArray();
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    char temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        str =new String(arr);
        System.out.println(str);
    }
}
