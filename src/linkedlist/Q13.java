//package linkedlist;
//// 13. Count nodes in circular linked list
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
//class CircularLinkedList {
//    Node head;
//
//    public CircularLinkedList() {
//        this.head = null;
//    }
//
//    // Add a node to the circular linked list
//    public void addNode(int data) {
//        Node newNode = new Node(data);
//        if (head == null) {
//            head = newNode;
//            newNode.next = head;
//        } else {
//            Node current = head;
//            while (current.next != head) {
//                current = current.next;
//            }
//            current.next = newNode;
//            newNode.next = head;
//        }
//    }
//
//    // Count the nodes in the circular linked list
//    public int countNodes() {
//        if (head == null) {
//            return 0;
//        }
//
//        int count = 1; // Start from 1 since head is not null
//        Node current = head.next;
//        while (current != head) {
//            count++;
//            current = current.next;
//        }
//
//        return count;
//    }
//}
//
//public class Q13 {
//    public static void main(String[] args) {
//        CircularLinkedList list = new CircularLinkedList();
//        list.addNode(1);
//        list.addNode(2);
//        list.addNode(3);
//        list.addNode(4);
//
//        int nodeCount = list.countNodes();
//        System.out.println("Number of nodes in the circular linked list: " + nodeCount);
//    }
//}
