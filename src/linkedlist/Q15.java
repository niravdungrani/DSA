//package linkedlist;
//// 15. Find length of looping nodes in the singly linked list.
//
//public class Q15 {
//    public static void main(String[] args) {
//        LinkedList singlyLinkedList = new LinkedList();
//        singlyLinkedList.insert(10);
//        singlyLinkedList.insert(20);
//        singlyLinkedList.insert(30);
//        singlyLinkedList.insert(40);
//        singlyLinkedList.insert(50);
//        singlyLinkedList.insert(60);
//        singlyLinkedList.countLoopingNodes();
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
//    public void countLoopingNodes() {
//        tail.next = head.next.next.next;
//        Node slow = head;
//        Node fast = head;
//        while(fast != null && fast.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//            if (slow == fast){
//                break;
//            }
//        }
//        slow = slow.next;
//        int count = 1;
//        while (slow != fast) {
//            count++;
//            System.out.print(slow.data + " ");
//            slow = slow.next;
//        }
//        System.out.println(slow.data);
//        System.out.println("The total nodes in the looping are : " + count);
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
