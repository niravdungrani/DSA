package String;

public class   Q15 {
    // 15. Remove duplicate chars from string
    public static void main(String[] args) {
        String str="Hello my name is niravn";
        String n="";
        for (int i=0;i<str.length();i++){
            int j=0;
            for (j=0;j<i;j++){
                if (str.charAt(i)==str.charAt(j)){
                    break;
                }
            }
            if (i==j){
                n=n+str.charAt(i);
            }
        }
        System.out.println(n);
    }
}
