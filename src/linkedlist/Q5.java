//package linkedlist;
//// 5. Get n'th node from the last of the singly linked list.
//
//public class Q5 {
//    public static void main(String[] args) {
//        LinkedList singlyLinkedList = new LinkedList();
//        singlyLinkedList.insert(10);
//        singlyLinkedList.insert(20);
//        singlyLinkedList.insert(30);
//        singlyLinkedList.insert(40);
//        singlyLinkedList.insert(50);
//        singlyLinkedList.print();
//        singlyLinkedList.nThNodeFromLast(4);
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
//    public void nThNodeFromLast(int index) {
//        if (head == null) {
//            System.out.println("The singly linked list is empty!");
//            return;
//        } else {
//            Node temp = head;
//            for (int i = 0; i < size() - index; i++) {
//                temp = temp.next;
//            }
//            System.out.println("The " + index + "'th element from the last in the singly linked list is : " + temp.data);
//        }
//    }
////    public void nThNodeFromLast(int index) {
////        if (head == null) {
////            System.out.println("The singly linked list is empty!");
////            return;
////        } else {
////            Node firstNode = head;
////            Node secondNode = head;
////            for (int i = 0; i < index; i++) {
////                firstNode = firstNode.next;
////            }
////            while (firstNode != null) {
////                firstNode = firstNode.next;
////                secondNode = secondNode.next;
////            }
////            System.out.println("The " + index + "'th element from the last in the singly linked list is : " + secondNode.data);
////        }
////    }
//}
//class Node {
//    int data;
//    Node next;
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
