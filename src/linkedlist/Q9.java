//package linkedlist;
//// 9. Print middle node of the singly linked list.
//
//public class Q9 {
//    public static void main(String[] args) {
//        LinkedList sinlgyLinkedList = new LinkedList();
//        sinlgyLinkedList.insert(10);
//        sinlgyLinkedList.insert(20);
//        sinlgyLinkedList.insert(30);
//        sinlgyLinkedList.insert(40);
//        sinlgyLinkedList.insert(50);
//        sinlgyLinkedList.insert(60);
//        sinlgyLinkedList.insert(70);
//        sinlgyLinkedList.print();
//        sinlgyLinkedList.printMiddleElement();
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
//    public void printMiddleElement() {
//        Node slow = head;
//        Node fast = head;
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        System.out.println("The middle element of a singlt linked list is : " + slow.data);
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
