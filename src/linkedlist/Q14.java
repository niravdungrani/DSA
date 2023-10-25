//package linkedlist;
//// 14. Detect loop in singly linked list.
//
//public class Q14 {
//    public static void main(String[] args) {
//        LinkedList singlyLinkedList = new LinkedList();
//        singlyLinkedList.insert(10);
//        singlyLinkedList.insert(20);
//        singlyLinkedList.insert(30);
//        singlyLinkedList.insert(40);
//        singlyLinkedList.insert(50);
//        singlyLinkedList.insert(60);
//        singlyLinkedList.loopOrNot();
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
//    public void loopOrNot() {
//        tail.next = head.next;
//        Node slow = head;
//        Node fast = head;
//        while(fast != null && fast.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//            if (slow == fast){
//                System.out.println("Looping nodes found in the singly linked list!");
//                return;
//            }
//        }
////            System.out.println("Looping nodes not found in the singly linked list!");
//        if (fast == null || fast.next == null) {
//            System.out.println("Looping nodes not found in the singly linked list!");
//        }
//    }
//}
//class Node {
//    int data;
//    Node next;
//    Node (int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
