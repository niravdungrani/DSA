package stack;

import java.util.Stack;

public class Q8 {
    // 8. Prefix to Infix Conversion
    public static void main(String[] args) {
        String prefix= "*+AB-CD";
        Stack<String> stack = new Stack<>();
        for (int i = prefix.length()-1; i >=0 ; i--) {
            if (prefix.charAt(i)=='+'||prefix.charAt(i)=='-'||prefix.charAt(i)=='*'||prefix.charAt(i)=='/'){
                String left=stack.peek();
                stack.pop();
                String right=stack.peek();
                stack.pop();
                String result="("+left+prefix.charAt(i)+right+")";
                stack.push(result);
            }
            else {
                stack.push(String.valueOf(prefix.charAt(i)));
            }
        }
        System.out.println(stack);
    }
}
