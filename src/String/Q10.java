package String;

public class Q10 {
    // 10. find duplicate chars from string
    public static void main(String[] args) {

        String str="Hello My name is nirav";
        int count=0;
        char[] string=str.toCharArray();
        for (int i =0;i<string.length;i++){
            count=1;
            for (int j =i+1;j<string.length;j++){
                if (string[i]==string[j]&&string[i]!=' '){
                    count++;
                    string[j]='0';
                }
            }
            if (count>1&&string[i]!='0'){
                System.out.println(count+" "+string[i]);
            }
        }
    }

}
