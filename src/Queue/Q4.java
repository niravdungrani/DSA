package Queue;
import java.util.Stack;

public class Q4 {
    static Stack<Integer> Stack1 = new Stack<Integer>();
    static Stack<Integer> Stack2 = new Stack<Integer>();
    public static void main(String[] args) {
        offer(10);
        offer(20);
        offer(30);
        print();
        poll();
        print();
        offer(40);
        print();
        poll();
        poll();
        print();
    }
    private static void poll() {
        if (Stack1.isEmpty()){
            return;
        }
        System.out.println(Stack1.peek() + " is removed!");
        Stack1.pop();
    }
    private static void print() {
        System.out.println(Stack1);
    }
    private static void offer(int value) {
        while (!Stack1.isEmpty()) {
            Stack2.push(Stack1.pop());
        }
        Stack1.push(value);
        while (!Stack2.isEmpty()) {
            Stack1.push(Stack2.pop());
        }
    }
}

//public class FourthQuestion {
//    public static void main(String[] args){
//        QueueImplementation queue = new QueueImplementation();
//        queue.add(10);
//        queue.add(20);
//        queue.remove();
//        while (!queue.isEmpty()) {
//            System.out.print(queue.peek() + " ");
//            queue.remove();
//        }
//    }
//    static class QueueImplementation {
//        static Stack<Integer> firstStack = new Stack<Integer>();
//        static Stack<Integer> secondStack = new Stack<Integer>();
//        public static int peek() {
//            if (isEmpty()) {
//                System.out.println("The queue is underflow!");
//                return -1;
//            }
//            return firstStack.peek();
//        }
//        public static int remove() {
//            if (firstStack.isEmpty()) {
//                System.out.println("The queue is underflow!");
//                return -1;
//            }
//            return firstStack.pop();
//        }
//        public static void add(int value) {
//            while (!firstStack.isEmpty()) {
//                secondStack.push(firstStack.pop());
//            }
//            firstStack.push(value);
//            while (!secondStack.isEmpty()) {
//                firstStack.push(secondStack.pop());
//            }
//        }
//        public static boolean isEmpty() {
//            return firstStack.isEmpty();
//        }
//    }
//}
