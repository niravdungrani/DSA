//package linkedlist;
//// 17. Find pairs with given sum in sorted doubly linked list.
//
//public class Q17 {
//    public static void main(String[] args) {
//        LinkedList doublyLinkedList = new LinkedList();
//        doublyLinkedList.insertLast(10);
//        doublyLinkedList.insertLast(20);
//        doublyLinkedList.insertLast(30);
//        doublyLinkedList.insertLast(40);
//        doublyLinkedList.insertLast(50);
//        doublyLinkedList.print();
//        doublyLinkedList.findPairWithSum(80);
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
//    public void findPairWithSum(int sum) {
//        if (head == null) {
//            System.out.println("The doubly linked list is empty!");
//            return;
//        } else if (head == tail) {
//            System.out.println("There is only one node!");
//            return;
//        } else {
//            Node startNode = head;
//            Node endNode = tail;
//            while (startNode.data != endNode.data) {
//                if (startNode.data + endNode.data == sum) {
//                    System.out.println("The pair is : (" + startNode.data + ", " + endNode.data + ").");
//                    return;
//                } else if (startNode.data > endNode.data) {
//                    endNode = endNode.previous;
//                } else {
//                    startNode = startNode.next;
//                }
//            }
//            System.out.println("The pair with sum you want that not found in the doubly linked list!");
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