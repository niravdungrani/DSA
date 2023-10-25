//package linkedlist;
//// 20. Remove duplicates from a sorted doubly linked list.
//
//public class Q20 {
//    public static void main(String[] args) {
//        LinkedList doublyLinkedList = new LinkedList();
//        doublyLinkedList.insertLast(10);
//        doublyLinkedList.insertLast(20);
//        doublyLinkedList.insertLast(20);
//        doublyLinkedList.insertLast(30);
//        doublyLinkedList.insertLast(40);
//        doublyLinkedList.insertLast(40);
//        doublyLinkedList.insertLast(50);
//        doublyLinkedList.insertLast(60);
//        doublyLinkedList.insertLast(60);
//        doublyLinkedList.insertLast(60);
//        doublyLinkedList.insertLast(70);
//        doublyLinkedList.print();
//        doublyLinkedList.removeDuplicates();
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
//    public void removeDuplicates() {
////        if (head == null) {
////            System.out.println("The doubly linked list is empty!");
////            return;
////        } else if (head == tail) {
////            System.out.println("Only one node in doubly linked list!");
////            return;
////        } else {
////            Node temp = head;
////            while (temp != null) {
////                Node current = temp;
////                while (current != null && current.data == temp.data) {
////                    current = current.next;
////                }
////                temp.next = current;
////                temp = temp.next;
////            }
////        }
//        if (head == null) {
//            System.out.println("The doubly linked list is empty!");
//            return;
//        } else if (head == tail) {
//            System.out.println("Only one node in doubly linked list!");
//            return;
//        } else {
//            Node temp = head;
//            while (temp != null && temp.next != null) {
//                if (temp.data == temp.next.data) {
//                    temp.next = temp.next.next;
//                    if (temp.next != null) {
//                        temp.next.previous = temp;
//                    }
//                } else {
//                    temp = temp.next;
//                }
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