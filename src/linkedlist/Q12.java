//package linkedlist;
//// 12. Check if linked list is circular linked list or not.
//
//public class Q12 {
//    public static void main(String[] args) {
//        LinkedList circularLinkedList = new LinkedList();
//        circularLinkedList.insertLast(10);
//        circularLinkedList.insertLast(20);
//        circularLinkedList.insertLast(30);
//        circularLinkedList.insertLast(40);
//        circularLinkedList.circularOrNot();
//    }
//}
//class LinkedList {
//    Node head;
//    public void insertLast(int value) {
//        Node newNode = new Node(value);
//        if (head == null) {
//            head = newNode;
//            head.next = newNode;
////            head.next = null;
//        } else {
//            Node temp = head;
//            while (temp.next != head) {
//                temp = temp.next;
//            }
//            temp.next = newNode;
//            newNode.next = head;
////            newNode.next = null;
//        }
//    }
//    public void circularOrNot() {
//        if (head == null) {
//            System.out.println("The circular linked list is empty!");
//            return;
//        } else if (head.next == head) {
//            System.out.println("The linked list is circular linked list!");
//        } else {
//            Node slow = head;
//            Node fast = head;
//            while (fast != null && fast.next != null) {
//                slow = slow.next;
//                fast = fast.next.next;
//                if (slow == fast) {
//                    System.out.println("The linked list is circular linked list!");
//                    return;
//                }
//            }
//            System.out.println("The linked list is not a circular linked list!");
//        }
//    }
//}
//class Node {
//    int data;
//    Node next;
//    Node(int data) {
//        this.data = data;
//    }
//}
