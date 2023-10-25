package Queue;
import java.util.LinkedList;
import java.util.Queue;

public class Q3 {
    static Queue<Integer> Queue1 = new LinkedList<>();
    static Queue<Integer> Queue2 = new LinkedList<>();
    public static void main(String[] args) {
        push(10);
        push(20);
        print();
        pop();
        print();
        push(30);
        print();
        pop();
        push(40);
        print();
    }
    private static void pop() {
        for (int i = 1; i < Queue1.size(); i++){
            Queue2.add(Queue1.poll());
        }
        Queue1.poll();
        Queue<Integer>  temp = Queue1;
        Queue1 = Queue2;
        Queue2 = temp;
    }
    private static void print() {
        System.out.println(Queue1);
    }
    private static void push(int i) {
        Queue1.add(i);
    }
}

//public class ThirdQuestion {
//    public static void main (String[] args) {
//        StackImplementation stack = new StackImplementation();
//        stack.push(10);
//        stack.push(20);
//        stack.pop();
//        stack.push(30);
//        while (!stack.isEmpty()) {
//            System.out.print((stack.peek() + " "));
//            stack.pop();
//        }
//    }
//    static class StackImplementation {
//        static Queue<Integer> firstQueue = new LinkedList<Integer>();
//        static Queue<Integer> secondQueue = new LinkedList<Integer>();
//        public static int peek() {
//            if (isEmpty()) {
//                System.out.println("The stack is underflow!");
//                return -1;
//            }
//            int top = -1;
//            if (!firstQueue.isEmpty()) {
//                while (!firstQueue.isEmpty()) {
//                    top = firstQueue.remove();
//                    secondQueue.add(top);
//                }
//            } else {
//                while (!secondQueue.isEmpty()) {
//                    top = secondQueue.remove();
//                    firstQueue.add(top);
//                }
//            }
//            return top;
//        }
//        public static int pop() {
//            if (isEmpty()) {
//                System.out.println("The stack is underflow!");
//                return -1;
//            }
//            int top = -1;
//            if (!firstQueue.isEmpty()) {
//                while (!firstQueue.isEmpty()) {
//                    top = firstQueue.remove();
//                    if (firstQueue.isEmpty()) {
//                        break;
//                    }
//                    secondQueue.add(top);
//                }
//            } else {
//                while (!secondQueue.isEmpty()) {
//                    top = secondQueue.remove();
//                    if (secondQueue.isEmpty()) {
//                        break;
//                    }
//                    firstQueue.add(top);
//                }
//            }
//            return top;
//        }
//        public static void push(int value) {
//            if (!firstQueue.isEmpty()) {
//                firstQueue.add(value);
//            } else {
//                secondQueue.add(value);
//            }
//        }
//        public static boolean isEmpty() {
//            return firstQueue.isEmpty() && secondQueue.isEmpty();
//        }
//    }
//}
