package stack;

import java.util.Stack;

public class Q6 {
    // 6. Find min in O(1) from stack
    static Stack<Integer> stack=new Stack<>();
    static Stack<Integer> minStack=new Stack<>();

    public static void main(String[] args) {
        push(10);
        push(20);
        push(1);
        pop();
        push(2);
        System.out.println(getMin());

    }

    private static int getMin() {

        return minStack.peek();
    }

    private static void pop() {
        if (minStack.peek()==stack.peek()){
            minStack.pop();
        }
        stack.pop();
    }

    private static void push(int value) {
        if (minStack.isEmpty()){
            minStack.push(value);
        } else if (minStack.peek()>=value) {
            minStack.push(value);
        }
        stack.push(value);
    }
}
