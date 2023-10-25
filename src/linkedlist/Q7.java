//package linkedlist;
////7. Create and print circular linked list without tail node
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
//    public void insert(int data) {
//        Node newNode = new Node(data);
//        if (head == null) {
//            head = newNode;
//            head.next = head;
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
//    public void printList() {
//        if (head == null) {
//            System.out.println("List is empty");
//            return;
//        }
//
//        Node current = head;
//        do {
//            System.out.print(current.data + " ");
//            current = current.next;
//        } while (current != head);
//        System.out.println();
//    }
//}
//
//public class Q7 {
//    public static void main(String[] args) {
//        CircularLinkedList clist = new CircularLinkedList();
//        clist.insert(1);
//        clist.insert(2);
//        clist.insert(3);
//        clist.insert(4);
//
//        System.out.println("Circular Linked List:");
//        clist.printList();
//    }
//}
