//package linkedlist;
//// 3. Print the singly linked list in reverse order.
//
//public class Q3 {
//    public static void main(String[] args) {
//        LinkedList singlyLinkedList = new LinkedList();
//        singlyLinkedList.insert(10);
//        singlyLinkedList.insert(20);
//        singlyLinkedList.insert(30);
//        singlyLinkedList.insert(40);
//        singlyLinkedList.insert(50);
//        singlyLinkedList.print();
//        singlyLinkedList.printInReversedOrder();
//    }
//}
//class LinkedList {
//    Node head;
//    Node tail;
//    public void insert(int value) {
//        Node newNode = new Node(value);
//        if (head == null) {
//            head = newNode;
//            tail = newNode;
//        } else {
//            tail.next = newNode;
//            tail = newNode;
//        }
//    }
//    public void print() {
//        if (head == null) {
//            System.out.println("The singly linked list is empty!");
//            return;
//        } else {
//            Node temp = head;
//            System.out.print("Original : ");
//            while (temp != null) {
//                System.out.print(temp.data + " ");
//                temp = temp.next;
//            }
//            System.out.println();
//        }
//    }
//    public int size() {
//        if (head == null) {
//            System.out.println("The singly linked list is empty!");
//            return -1;
//        } else {
//            int count = 0;
//            Node temp = head;
//            while (temp != null) {
//                count++;
//                temp = temp.next;
//            }
//            return count;
//        }
//    }
//    //    public void printInReversedOrder() {
////        if (head == null) {
////            System.out.println("The singly linked list is empty!");
////            return;
////        } else {
////            Node current = tail;
////            System.out.print("Reversed : ");
////            for (int i = 0; i < size(); i++) {
////                Node temp = head;
////                for (int j = 0; j < size() - i - 1; j++) {
////                    temp = temp.next;
////                }
////                System.out.print(temp.data + " ");
////            }
////        }
////    }
//    public void printInReversedOrder() {
//        if (head == null) {
//            System.out.println("The singly linked list is empty!");
//            return;
//        } else {
//            Node previous = null;
//            Node current = head;
//            Node next = null;
//            while (current != null) {
//                next = current.next;
//                current.next = previous;
//                previous = current;
//                current = next;
//            }
//            System.out.print("Reversed : ");
//            while (previous != null) {
//                System.out.print(previous.data + " ");
//                previous = previous.next;
//            }
//            System.out.println();
//        }
//    }
//}
//class Node {
//    int data;
//    Node next;
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
