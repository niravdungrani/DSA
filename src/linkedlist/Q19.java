//package linkedlist;
//// 19. Insert value in sorted way in a sorted doubly linked list.
//
//public class Q19 {
//    public static void main(String[] args) {
//        LinkedList doublyLinkedList = new LinkedList();
//        doublyLinkedList.insertAsSorted(3);
//        doublyLinkedList.insertAsSorted(1);
//        doublyLinkedList.insertAsSorted(5);
//        doublyLinkedList.insertAsSorted(2);
//        doublyLinkedList.insertAsSorted(4);
//        doublyLinkedList.print();
//    }
//}
//class LinkedList {
//    Node head;
//    Node tail;
//    public void insertAsSorted(int value) {
//        Node newNode = new Node(value);
//        if (head == null) {
//            head = newNode;
//        } else if (value <= head.data) {
//            newNode.next = head;
//            head.previous = newNode;
//            head = newNode;
//        } else {
//            Node temp = head;
//            while (value > temp.data) {
//                if (temp.next == null) {
//                    temp.next = newNode;
//                    newNode.previous = temp;
//                    return;
//                }
//                temp = temp.next;
//            }
//            newNode.previous = temp.previous;
//            temp.previous.next = newNode;
//            newNode.next = temp;
//            temp.previous = newNode;
////            Node temp = head;
////            while (temp.next != null && temp.next.data < value) {
////                temp = temp.next;
////            }
////            newNode.next = temp.next;
////            newNode.previous = temp;
////            if (temp.next != null) {
////                temp.next.previous = newNode;
////            }
////            temp.next = newNode;
//        }
//    }
//    public void print () {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//}
//class Node {
//    int data;
//    Node previous;
//    Node next;
//    public Node(int data) {
//        this.data = data;
//        this.previous = null;
//        this.next = null;
//    }
//}