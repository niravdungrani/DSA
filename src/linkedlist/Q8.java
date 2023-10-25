//package linkedlist;
//// 8. Exchange first and last nodes in circular linked list.
//
//public class Q8 {
//    public static void main(String[] args) {
//        LinkedList circularLinkedList = new LinkedList();
//        circularLinkedList.insertLast(10);
//        circularLinkedList.insertLast(20);
//        circularLinkedList.insertLast(30);
//        circularLinkedList.insertLast(40);
//        circularLinkedList.insertLast(50);
//        circularLinkedList.print();
//        circularLinkedList.exchangeFirstLastNodes();
//        circularLinkedList.print();
//    }
//}
//class LinkedList {
//    Node head;
//    public void insertLast(int value) {
//        Node newNode = new Node(value);
//        if (head == null) {
//            head = newNode;
//            head.next = newNode;
//        } else {
//            Node temp = head;
//            while (temp.next != head) {
//                temp = temp.next;
//            }
//            temp.next = newNode;
//            newNode.next = head;
//        }
//    }
//    public void exchangeFirstLastNodes() {
//        if (head == null) {
//            System.out.println("The circular linked list is empty!");
//            return;
//        } else if (head.next == head) {
//            System.out.println("Only one node in circular linked list!");
//            return;
//        } else if (head.next.next == head) {
//            head = head.next;
//        } else {
//            Node last = head;
//            while (last.next.next != head) {
//                last = last.next;
//            }
//            last.next.next = head.next;
//            head.next = last.next;
//            last.next = head;
//            head = head.next;
//        }
//    }
//    public void print() {
//        if (head == null) {
//            System.out.println("The circular linked list is empty!");
//            return;
//        } else {
//            Node temp = head;
//            do {
//                System.out.print(temp.data + " ");
//                temp = temp.next;
//            } while (temp != head);
//            System.out.println();
//        }
//    }
//}
//class Node {
//    int data;
//    Node next;
//    public Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
