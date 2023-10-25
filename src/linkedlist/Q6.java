//package linkedlist;
//// 6. Given only a pointer to a node to be deleted in a singly linked list, how do you delete it? (head not given).
//
//public class Q6 {
//    public static void main(String[] args) {
//        LinkedList singlyLinkedList = new LinkedList();
//        singlyLinkedList.insert(10);
//        singlyLinkedList.insert(20);
//        singlyLinkedList.insert(30);
//        singlyLinkedList.insert(40);
//        singlyLinkedList.insert(50);
//        singlyLinkedList.print();
//        singlyLinkedList.deleteWithoutHead(singlyLinkedList.head.next);
//        singlyLinkedList.print();
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
//    public void deleteWithoutHead(Node pointedNode) {
//        if (pointedNode == null || pointedNode.next == null) {
//            return;
//        }
//        Node temp = pointedNode.next;
//        pointedNode.data = pointedNode.next.data;
//        pointedNode.next = pointedNode.next.next;
//        temp.next = null;
////        temp = null;
//    }
//}
//class Node {
//    int data;
//    Node next;
//    public Node (int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
