package String;

public class Q14 {
    // 14. Check if string have equal digits and chars
    public static void main(String[] args) {
        String s="niraav0307201b";
        int count=0;
        int n=s.length();
        for (int i=0;i<s.length();i++){
            int ascii=s.charAt(i);
            if (ascii>=48&&ascii<=57){
                count++;
            }
        }
        if (n-count==count){
            System.out.println("true");
            return;
        }
        System.out.println("false");
    }
}
