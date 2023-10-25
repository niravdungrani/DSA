package stack;

import java.util.Stack;

class MinStack {
    Stack<Integer> stack=new Stack<>();
    int minElement=Integer.MAX_VALUE;


    public void push(int value) {
        if (value <= minElement) {
            stack.push(minElement);
            minElement = value;
        }
        stack.push(value);
    }

    public int pop() {
        if (stack.peek() == minElement) {
            stack.pop();
            minElement = stack.pop();
        } else {
            return stack.pop();
        }
        return minElement;
    }

    public int getMin() {
        return minElement;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

public class Q13 {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(3);
        minStack.push(5);
        System.out.println("Minimum element: " + minStack.getMin());

        minStack.push(2);
        minStack.push(1);

        System.out.println("Minimum element: " + minStack.getMin());

        minStack.pop();
        System.out.println("Minimum element: " + minStack.getMin());
    }
}
