package stack;

import java.util.Stack;

public class Q11 {
    //11. Remove All Adjacent Duplicates In String - Input: “abbaca” output: “ca”
    public static void main(String[] args) {
        String s = "abbacddce";
        Stack<Character> stack = new Stack<>();
        String str = "";

        for(int i=s.length()-1; i>=0; i--){
            char c = s.charAt(i);
            if(stack.isEmpty() || stack.peek() != c){
                stack.push(c);
            }
            else{
                stack.pop();
            }
        }
        while(!stack.isEmpty()){
            str = str+stack.pop();
        }
        System.out.println(str);

    }
}
