package String;

public class Q3 {
// 3. count number of words in a String (with / without split function)
        public static void main(String[] args) {
            String string = "    India  Is  My  Country  ";
            int count = 0;
//            String str= string.trim();

            char ch[] = new char[string.length()];
            for (int i = 0; i < string.length(); i++) {
                ch[i] = string.charAt(i);
                if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0)))
                    count++;
            }
            System.out.println(count);

        }
    }
