package stack;

import java.util.Arrays;

public class Q12 {
    // 2 stack using 1 array.
    public static void main(String[] args) {
                int[]stack=new int[7];
                int top1=-1;
                int top2=stack.length-1;
                top1=push(stack,10,top1);
                top1=push(stack,20,top1);
                top1=push(stack,30,top1);
                top2=push2(stack,70,top2);
                top2=push2(stack,80,top2);
                top2=push2(stack,90,top2);
                top1=pop(stack,top1);
                top2=pop2(stack,top2);
                peek(stack,top1);
                peek2(stack,top2);
            }

            private static void peek2(int[] stack, int top2) {
                if (top2==stack.length-1){
                    System.out.println("stack is emty");
                    return;
                }
                while (top2>=stack.length-1){
                    System.out.println(stack[top2]+" ");
                    top2++;
                }
            }

            private static void peek(int[] stack, int top1) {
                if (top1 == -1){
                    System.out.println("stack is emty");
                    return;
                }
                while (top1 >= 0) {
                    System.out.println(stack[top1] + " ");
                    top1--;
                }
            }


            private static int pop2(int[] stack, int top2) {
                if (top2==stack.length-1){
                    System.out.println("stack is Emty");
                }
                System.out.println(" delete "+stack[top2]);
                top2++;
                return top2;
            }

            private static int pop(int[] stack, int top1) {
                if (top1==-1){
                    System.out.println("stack is Emty");
                }
                System.out.println("delete "+stack[top1]);
                top1--;
                return top1;
            }

            private static int push2(int[] stack, int v, int top2) {
                top2--;
                stack[top2]=v;
                return top2;
            }

            private static int push(int[] stack, int v, int top1) {
                top1++;
                stack[top1]=v;
                return top1;
    }
}
