package stack;

import java.util.Stack;

public class Q3 {
    // 3. Check if string is palindrome or not using stack
    public static void main(String[] args) {
        String s="noon";
        Stack stack=new Stack();
        for (int i=0;i<s.length();i++){
            stack.push(s.charAt(i));
        }
        String rs="";
        while (!stack.isEmpty()){
            rs=rs+stack.pop();
        }
        if (s.equals(rs)){
            System.out.println("Stack is palindrome");
        }
        else {
            System.out.println("Stack is not palindrome");
        }
    }
}
