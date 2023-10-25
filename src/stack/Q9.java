package stack;

import java.util.Stack;

public class Q9 {
    // 9. Postfix to Infix Conversion
    public static void main(String[] args) {
        String posfix= "AB+CD-*";
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < posfix.length(); i++) {
            if (posfix.charAt(i)=='+'||posfix.charAt(i)=='-'||posfix.charAt(i)=='*'||posfix.charAt(i)=='/'){
                String right=stack.peek();
                stack.pop();
                String left=stack.peek();
                stack.pop();
                String result="("+left+posfix.charAt(i)+right+")";
                stack.push(result);
            }
            else {
                stack.push(String.valueOf(posfix.charAt(i)));
            }
        }
        System.out.println(stack);
    }
}
