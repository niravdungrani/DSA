//package linkedlist;
//// 2. Count all nodes or length of a singly linked list.
//
//public class Q2 {
//    public static void main(String[] args) {
//        LinkedList singlyLinkedList = new LinkedList();
//        singlyLinkedList.size();
//        singlyLinkedList.insert(10);
//        singlyLinkedList.insert(20);
//        singlyLinkedList.insert(30);
//        singlyLinkedList.print();
//        singlyLinkedList.size();
//        singlyLinkedList.delete(30);
//        singlyLinkedList.print();
//        singlyLinkedList.size();
//        singlyLinkedList.insert(40);
//        singlyLinkedList.print();
//        singlyLinkedList.size();
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
//            while (temp != null) {
//                System.out.print(temp.data + " ");
//                temp = temp.next;
//            }
//            System.out.println();
//        }
//    }
//    public void delete(int value) {
//        if (head == null) {
//            System.out.println("The singly linked list is empty!");
//            return;
//        } else if (head == tail && head.data == value) {
//            head = null;
//            tail = null;
//        } else if (head.data == value) {
//            Node temp = head;
//            head = head.next;
//            temp.next = null;
//        } else {
//            Node current = head.next;
//            Node previous = head;
//            while (current != null && current.data != value) {
//                previous = current;
//                current = current.next;
//            }
//            if (current == tail) {
//                tail = previous;
//            }
//            if (current != null && current.data == value) {
//                previous.next = current.next;
//                current.next = null;
//            }
//        }
//    }
//    public void size() {
//        if (head == null) {
//            System.out.println("The singly linked list is empty!");
//            return;
//        } else {
//            int count = 0;
//            Node temp = head;
//            while (temp != null) {
//                count++;
//                temp = temp.next;
//            }
//            System.out.println("The size of singly linked list is : " + count);
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
