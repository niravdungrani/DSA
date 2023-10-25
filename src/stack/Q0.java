package stack;

public class Q0 {
    public static void main(String[] args) {
        int[] stack = new int[5];
        int top=-1;
        System.out.println("is empty :"+isEmpty(top));
        top=push(stack,top,10);
        top=push(stack,top,20);
        top=push(stack,top,30);
        top=push(stack,top,40);
        top=push(stack,top,50);
        top=push(stack,top,60);
        print(stack,top);
        top=pop(stack,top);
        print(stack,top);
        System.out.println("size :"+size(top));
    }

    private static int size(int top) {
        return top+1;
    }

    private static void print(int[] stack, int top) {
        while (top>=0){
            System.out.print(stack[top]+" ");
            top--;
        }
    }

    private static boolean isEmpty(int top) {
        if (top==-1){
            return true;
        }
        return false;
    }

    private static int push(int[] stack, int top, int value) {
        if (top==stack.length-1){
            System.out.println("stack is overflow");
            return top;
        }
        top++;
        stack[top]=value;
        return top;
    }

    private static int pop(int[] stack, int top) {
        if (top==-1){
            System.out.println("Stack is empty");
            return top;
        }
        System.out.println("popped value is : "+stack[top]);
        top--;
        return top;
    }
}
