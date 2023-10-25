//package linkedlist;
//// 11. Reverse a linked list
//class Node {
//    int data;
//    Node next;
//
//    public Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//class LinkedList {
//    Node head;
//
//    public LinkedList() {
//        this.head = null;
//    }
//
//    public void add(int data) {
//        Node newNode = new Node(data);
//        if (head == null) {
//            head = newNode;
//        } else {
//            Node current = head;
//            while (current.next != null) {
//                current = current.next;
//            }
//            current.next = newNode;
//        }
//    }
//
//    public void reverse() {
//        Node prev = null;
//        Node current = head;
//        Node next = null;
//
//        while (current != null) {
//            next = current.next;
//            current.next = prev;
//            prev = current;
//            current = next;
//        }
//
//        head = prev;
//    }
//
//    public void print() {
//        Node current = head;
//        while (current != null) {
//            System.out.print(current.data + " ");
//            current = current.next;
//        }
//        System.out.println();
//    }
//}
//
//public class Q11 {
//    public static void main(String[] args) {
//        LinkedList list = new LinkedList();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//
//        System.out.println("Original linked list:");
//        list.print();
//
//        list.reverse();
//
//        System.out.println("Reversed linked list:");
//        list.print();
//    }
//}
