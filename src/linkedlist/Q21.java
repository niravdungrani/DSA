 package linkedlist;
// 21. Given only a pointer to a node to be deleted in a doubly linked list, delete it.

public class Q21 {
    public static void main(String[] args) {
        LinkedList doublyLinkedList = new LinkedList();
        doublyLinkedList.insertLast(10);
        doublyLinkedList.insertLast(20);
        doublyLinkedList.insertLast(30);
        doublyLinkedList.insertLast(40);
        doublyLinkedList.insertLast(50);
        doublyLinkedList.insertLast(60);
        doublyLinkedList.print();
        doublyLinkedList.deleteWithoutHead(doublyLinkedList.head.next.next.next);
        doublyLinkedList.print();
    }
}
class LinkedList {
    Node head;
    Node tail;
    public void insertLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    }
    public void print() {
        if (head == null) {
            System.out.println("The doubly linked list is empty!");
            return;
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public void deleteWithoutHead(Node pointedNode) {
//        if (pointedNode == null) {
//            return;
//        }
//        if (pointedNode.previous != null) {
//            pointedNode.previous.next = pointedNode.next;
//        }
//        if (pointedNode.next != null) {
//            pointedNode.next.previous = pointedNode.previous;
//        }
//        pointedNode.previous = null;
//        pointedNode.next = null;

        if (pointedNode == null || pointedNode.next == null) {
            return;
        } else {
            Node temp = pointedNode;
            temp.previous.next = temp.next;
            temp.next.previous = temp.previous;
            temp = null;
        }
    }
}
class Node {
    int data;
    Node previous;
    Node next;
    Node (int data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }
}

