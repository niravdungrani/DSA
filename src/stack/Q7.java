package stack;

import java.util.Stack;

public class Q7 {
    // 7. Check for Balanced parentheses in an expression
    public static void main(String[] args) {
        String s="[{({{(}})}]()";
        Stack <Character> stack=new Stack<>();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='['||s.charAt(i)=='{'||s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }
            else {
                if (stack.isEmpty()){
                    System.out.println("Not Balanced");
                    return;
                }
                char popped =stack.pop();
                if ((s.charAt(i)==')'&& popped!='(') || (s.charAt(i)=='}'&& popped!='{') || (s.charAt(i)==']'&& popped!='[') ){
                    System.out.println("Not Balanced");
                    return;
                }
            }
        }
        if (stack.isEmpty()){
            System.out.println("Balanced");
        }
        else {
            System.out.println("Not Balanced");
        }
    }

}
