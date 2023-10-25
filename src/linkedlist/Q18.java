//package linkedlist;
//// 18. Reverse a doubly linked list.
//
//public class Q18 {
//    public static void main(String[] args) {
//        LinkedList doublyLinkedList = new LinkedList();
//        doublyLinkedList.insertLast(10);
//        doublyLinkedList.insertLast(20);
//        doublyLinkedList.insertLast(30);
//        doublyLinkedList.insertLast(40);
//        doublyLinkedList.insertLast(50);
//        doublyLinkedList.print();
//        doublyLinkedList.reverse();
//        System.out.println("After reverse : ");
//        doublyLinkedList.print();
//    }
//}
//class LinkedList {
//    Node head;
//    Node tail;
//    public void insertLast(int value) {
//        Node newNode = new Node(value);
//        if (head == null) {
//            head = newNode;
//            tail = newNode;
//        } else {
//            tail.next = newNode;
//            newNode.previous = tail;
//            tail = newNode;
//        }
//    }
//    public void print() {
//        if (head == null) {
//            System.out.println("The doubly linked list is empty!");
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
//    public void reverse() {
//        if (head == null) {
//            System.out.println("The doubly linked list is empty!");
//            return;
//        } else {
//            Node temp = null;
//            Node current = head;
//            while (current != null)
//            {
//                temp = current.previous;
//                current.previous = current.next;
//                current.next = temp;
//                current = current.previous;
//            }
//            if (temp != null)
//            {
//                head = temp.previous;
//            }
//        }
//    }
//}
//class Node {
//    int data;
//    Node previous;
//    Node next;
//    Node (int data) {
//        this.data = data;
//        this.previous = null;
//        this.next = null;
//    }
//}